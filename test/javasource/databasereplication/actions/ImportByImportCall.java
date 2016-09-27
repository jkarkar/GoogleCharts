// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package databasereplication.actions;

import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import com.mendix.webui.FeedbackHelper;
import databasereplication.implementation.ObjectBaseDBSettings;
import databasereplication.proxies.Database;
import databasereplication.proxies.TableMapping;

/**
 * Use the ImportCall to start a table import. Before starting the mapping the action will analyse and translate the constraints from the importcall 
 * 
 * Parameter InputOne and InputTwo are the instances of the two objects you can configure to use to set an association or to apply constraints. If you have specified to set an association to any of those objects or apply a constraint this will automatically by applied in this Java action. 
 * 
 * The parameter ApplyEntityAccess specifies if the import should run withor without all the security constraints of the user who triggers the import.
 * When you change this parameter to false, it will run without any security limitations (i.e. as MxAdministrator)
 * 
 * 
 * The result of this action is always 'true', if the import fails at any point it will return in an exception. 
 * 
 * The rollback behaviour is determined by your microflow and the transaction parameters in the TableMapping.
 */
public class ImportByImportCall extends CustomJavaAction<Boolean>
{
	private IMendixObject __CallConfig;
	private databasereplication.proxies.ImportCall CallConfig;
	private IMendixObject InputOne;
	private IMendixObject InputTwo;
	private Boolean ApplyEntityAcces;

	public ImportByImportCall(IContext context, IMendixObject CallConfig, IMendixObject InputOne, IMendixObject InputTwo, Boolean ApplyEntityAcces)
	{
		super(context);
		this.__CallConfig = CallConfig;
		this.InputOne = InputOne;
		this.InputTwo = InputTwo;
		this.ApplyEntityAcces = ApplyEntityAcces;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.CallConfig = __CallConfig == null ? null : databasereplication.proxies.ImportCall.initialize(getContext(), __CallConfig);

		// BEGIN USER CODE
		IContext context = this.getContext();
		TableMapping mapping = this.CallConfig.getImportCall_TableMapping();
		if(mapping == null)
		{
			throw new CoreException("There is no mapping defined in the importcall object. Importing can not be done");
		}
		Database CurDatabase = mapping.getTableMapping_Database(context);

		ObjectBaseDBSettings dbSettings = new ObjectBaseDBSettings( context, CurDatabase.getMendixObject() );
		ImportByMapping.importFromDatabaseWithImportCall(context, mapping, dbSettings, this, this.CallConfig, this.InputOne, this.InputTwo, this.ApplyEntityAcces);

		FeedbackHelper.addRefreshClass(this.getContext(), mapping.getTableMapping_MxObjectType().getCompleteName());
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "ImportByImportCall";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
