// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import communitycommons.Logging;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Logs a message to 'Community Commons' with loglevel 'Info'. 
 * - message: the message to log
 */
public class SimpleLog extends CustomJavaAction<Boolean>
{
	private String message;

	public SimpleLog(IContext context, String message)
	{
		super(context);
		this.message = message;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Logging.simpleLog(message);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "SimpleLog";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}