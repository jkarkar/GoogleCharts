// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public class Log
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject logMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseReplication.Log";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Logline("Logline"),
		Log_XMLDocumentTM("DatabaseReplication.Log_XMLDocumentTM");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Log(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseReplication.Log"));
	}

	protected Log(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject logMendixObject)
	{
		if (logMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseReplication.Log", logMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseReplication.Log");

		this.logMendixObject = logMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Log.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static databasereplication.proxies.Log initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasereplication.proxies.Log.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static databasereplication.proxies.Log initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasereplication.proxies.Log(context, mendixObject);
	}

	public static databasereplication.proxies.Log load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasereplication.proxies.Log.initialize(context, mendixObject);
	}

	public static java.util.List<databasereplication.proxies.Log> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasereplication.proxies.Log> result = new java.util.ArrayList<databasereplication.proxies.Log>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseReplication.Log" + xpathConstraint))
			result.add(databasereplication.proxies.Log.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Logline
	 */
	public final String getLogline()
	{
		return getLogline(getContext());
	}

	/**
	 * @param context
	 * @return value of Logline
	 */
	public final String getLogline(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Logline.toString());
	}

	/**
	 * Set value of Logline
	 * @param logline
	 */
	public final void setLogline(String logline)
	{
		setLogline(getContext(), logline);
	}

	/**
	 * Set value of Logline
	 * @param context
	 * @param logline
	 */
	public final void setLogline(com.mendix.systemwideinterfaces.core.IContext context, String logline)
	{
		getMendixObject().setValue(context, MemberNames.Logline.toString(), logline);
	}

	/**
	 * @return value of Log_XMLDocumentTM
	 */
	public final databasereplication.proxies.XMLDocumentTM getLog_XMLDocumentTM() throws com.mendix.core.CoreException
	{
		return getLog_XMLDocumentTM(getContext());
	}

	/**
	 * @param context
	 * @return value of Log_XMLDocumentTM
	 */
	public final databasereplication.proxies.XMLDocumentTM getLog_XMLDocumentTM(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.XMLDocumentTM result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Log_XMLDocumentTM.toString());
		if (identifier != null)
			result = databasereplication.proxies.XMLDocumentTM.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Log_XMLDocumentTM
	 * @param log_xmldocumenttm
	 */
	public final void setLog_XMLDocumentTM(databasereplication.proxies.XMLDocumentTM log_xmldocumenttm)
	{
		setLog_XMLDocumentTM(getContext(), log_xmldocumenttm);
	}

	/**
	 * Set value of Log_XMLDocumentTM
	 * @param context
	 * @param log_xmldocumenttm
	 */
	public final void setLog_XMLDocumentTM(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.XMLDocumentTM log_xmldocumenttm)
	{
		if (log_xmldocumenttm == null)
			getMendixObject().setValue(context, MemberNames.Log_XMLDocumentTM.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Log_XMLDocumentTM.toString(), log_xmldocumenttm.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return logMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final databasereplication.proxies.Log that = (databasereplication.proxies.Log) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DatabaseReplication.Log";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
