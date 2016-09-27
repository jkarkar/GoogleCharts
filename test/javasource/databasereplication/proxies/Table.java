// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public class Table
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tableMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseReplication.Table";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DbId("DbId"),
		TableId("TableId"),
		Name("Name"),
		UpdateCounter("UpdateCounter"),
		Table_Database("DatabaseReplication.Table_Database");

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

	public Table(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseReplication.Table"));
	}

	protected Table(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tableMendixObject)
	{
		if (tableMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseReplication.Table", tableMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseReplication.Table");

		this.tableMendixObject = tableMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Table.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static databasereplication.proxies.Table initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasereplication.proxies.Table.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static databasereplication.proxies.Table initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasereplication.proxies.Table(context, mendixObject);
	}

	public static databasereplication.proxies.Table load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasereplication.proxies.Table.initialize(context, mendixObject);
	}

	public static java.util.List<databasereplication.proxies.Table> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasereplication.proxies.Table> result = new java.util.ArrayList<databasereplication.proxies.Table>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseReplication.Table" + xpathConstraint))
			result.add(databasereplication.proxies.Table.initialize(context, obj));
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
	 * @return value of DbId
	 */
	public final Long getDbId()
	{
		return getDbId(getContext());
	}

	/**
	 * @param context
	 * @return value of DbId
	 */
	public final Long getDbId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.DbId.toString());
	}

	/**
	 * Set value of DbId
	 * @param dbid
	 */
	public final void setDbId(Long dbid)
	{
		setDbId(getContext(), dbid);
	}

	/**
	 * Set value of DbId
	 * @param context
	 * @param dbid
	 */
	public final void setDbId(com.mendix.systemwideinterfaces.core.IContext context, Long dbid)
	{
		getMendixObject().setValue(context, MemberNames.DbId.toString(), dbid);
	}

	/**
	 * @return value of TableId
	 */
	public final Long getTableId()
	{
		return getTableId(getContext());
	}

	/**
	 * @param context
	 * @return value of TableId
	 */
	public final Long getTableId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.TableId.toString());
	}

	/**
	 * Set value of TableId
	 * @param tableid
	 */
	public final void setTableId(Long tableid)
	{
		setTableId(getContext(), tableid);
	}

	/**
	 * Set value of TableId
	 * @param context
	 * @param tableid
	 */
	public final void setTableId(com.mendix.systemwideinterfaces.core.IContext context, Long tableid)
	{
		getMendixObject().setValue(context, MemberNames.TableId.toString(), tableid);
	}

	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of UpdateCounter
	 */
	public final Integer getUpdateCounter()
	{
		return getUpdateCounter(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateCounter
	 */
	public final Integer getUpdateCounter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.UpdateCounter.toString());
	}

	/**
	 * Set value of UpdateCounter
	 * @param updatecounter
	 */
	public final void setUpdateCounter(Integer updatecounter)
	{
		setUpdateCounter(getContext(), updatecounter);
	}

	/**
	 * Set value of UpdateCounter
	 * @param context
	 * @param updatecounter
	 */
	public final void setUpdateCounter(com.mendix.systemwideinterfaces.core.IContext context, Integer updatecounter)
	{
		getMendixObject().setValue(context, MemberNames.UpdateCounter.toString(), updatecounter);
	}

	/**
	 * @return value of Table_Database
	 */
	public final databasereplication.proxies.Database getTable_Database() throws com.mendix.core.CoreException
	{
		return getTable_Database(getContext());
	}

	/**
	 * @param context
	 * @return value of Table_Database
	 */
	public final databasereplication.proxies.Database getTable_Database(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.Database result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Table_Database.toString());
		if (identifier != null)
			result = databasereplication.proxies.Database.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Table_Database
	 * @param table_database
	 */
	public final void setTable_Database(databasereplication.proxies.Database table_database)
	{
		setTable_Database(getContext(), table_database);
	}

	/**
	 * Set value of Table_Database
	 * @param context
	 * @param table_database
	 */
	public final void setTable_Database(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.Database table_database)
	{
		if (table_database == null)
			getMendixObject().setValue(context, MemberNames.Table_Database.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Table_Database.toString(), table_database.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tableMendixObject;
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
			final databasereplication.proxies.Table that = (databasereplication.proxies.Table) obj;
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
		return "DatabaseReplication.Table";
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
