// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public class AdditionalJoins
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject additionalJoinsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseReplication.AdditionalJoins";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Alias("Alias"),
		JoinType("JoinType"),
		ConstraintsInfo("ConstraintsInfo"),
		IsStored("IsStored"),
		IsFromTable("IsFromTable"),
		Token("Token"),
		AdditionalJoins_TableMapping("DatabaseReplication.AdditionalJoins_TableMapping"),
		AdditionalJoins_Table_Right("DatabaseReplication.AdditionalJoins_Table_Right"),
		AdditionalJoins_AdditionalJoins_Left("DatabaseReplication.AdditionalJoins_AdditionalJoins_Left");

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

	public AdditionalJoins(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseReplication.AdditionalJoins"));
	}

	protected AdditionalJoins(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject additionalJoinsMendixObject)
	{
		if (additionalJoinsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseReplication.AdditionalJoins", additionalJoinsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseReplication.AdditionalJoins");

		this.additionalJoinsMendixObject = additionalJoinsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AdditionalJoins.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static databasereplication.proxies.AdditionalJoins initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasereplication.proxies.AdditionalJoins.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static databasereplication.proxies.AdditionalJoins initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasereplication.proxies.AdditionalJoins(context, mendixObject);
	}

	public static databasereplication.proxies.AdditionalJoins load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasereplication.proxies.AdditionalJoins.initialize(context, mendixObject);
	}

	public static java.util.List<databasereplication.proxies.AdditionalJoins> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasereplication.proxies.AdditionalJoins> result = new java.util.ArrayList<databasereplication.proxies.AdditionalJoins>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseReplication.AdditionalJoins" + xpathConstraint))
			result.add(databasereplication.proxies.AdditionalJoins.initialize(context, obj));
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
	 * @return value of Alias
	 */
	public final String getAlias()
	{
		return getAlias(getContext());
	}

	/**
	 * @param context
	 * @return value of Alias
	 */
	public final String getAlias(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Alias.toString());
	}

	/**
	 * Set value of Alias
	 * @param alias
	 */
	public final void setAlias(String alias)
	{
		setAlias(getContext(), alias);
	}

	/**
	 * Set value of Alias
	 * @param context
	 * @param alias
	 */
	public final void setAlias(com.mendix.systemwideinterfaces.core.IContext context, String alias)
	{
		getMendixObject().setValue(context, MemberNames.Alias.toString(), alias);
	}

	/**
	 * Set value of JoinType
	 * @param jointype
	 */
	public final databasereplication.proxies.JoinType getJoinType()
	{
		return getJoinType(getContext());
	}

	/**
	 * @param context
	 * @return value of JoinType
	 */
	public final databasereplication.proxies.JoinType getJoinType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.JoinType.toString());
		if (obj == null)
			return null;

		return databasereplication.proxies.JoinType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of JoinType
	 * @param jointype
	 */
	public final void setJoinType(databasereplication.proxies.JoinType jointype)
	{
		setJoinType(getContext(), jointype);
	}

	/**
	 * Set value of JoinType
	 * @param context
	 * @param jointype
	 */
	public final void setJoinType(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.JoinType jointype)
	{
		if (jointype != null)
			getMendixObject().setValue(context, MemberNames.JoinType.toString(), jointype.toString());
		else
			getMendixObject().setValue(context, MemberNames.JoinType.toString(), null);
	}

	/**
	 * @return value of ConstraintsInfo
	 */
	public final String getConstraintsInfo()
	{
		return getConstraintsInfo(getContext());
	}

	/**
	 * @param context
	 * @return value of ConstraintsInfo
	 */
	public final String getConstraintsInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ConstraintsInfo.toString());
	}

	/**
	 * Set value of ConstraintsInfo
	 * @param constraintsinfo
	 */
	public final void setConstraintsInfo(String constraintsinfo)
	{
		setConstraintsInfo(getContext(), constraintsinfo);
	}

	/**
	 * Set value of ConstraintsInfo
	 * @param context
	 * @param constraintsinfo
	 */
	public final void setConstraintsInfo(com.mendix.systemwideinterfaces.core.IContext context, String constraintsinfo)
	{
		getMendixObject().setValue(context, MemberNames.ConstraintsInfo.toString(), constraintsinfo);
	}

	/**
	 * @return value of IsStored
	 */
	public final Integer getIsStored()
	{
		return getIsStored(getContext());
	}

	/**
	 * @param context
	 * @return value of IsStored
	 */
	public final Integer getIsStored(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.IsStored.toString());
	}

	/**
	 * Set value of IsStored
	 * @param isstored
	 */
	public final void setIsStored(Integer isstored)
	{
		setIsStored(getContext(), isstored);
	}

	/**
	 * Set value of IsStored
	 * @param context
	 * @param isstored
	 */
	public final void setIsStored(com.mendix.systemwideinterfaces.core.IContext context, Integer isstored)
	{
		getMendixObject().setValue(context, MemberNames.IsStored.toString(), isstored);
	}

	/**
	 * @return value of IsFromTable
	 */
	public final Boolean getIsFromTable()
	{
		return getIsFromTable(getContext());
	}

	/**
	 * @param context
	 * @return value of IsFromTable
	 */
	public final Boolean getIsFromTable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.IsFromTable.toString());
	}

	/**
	 * Set value of IsFromTable
	 * @param isfromtable
	 */
	public final void setIsFromTable(Boolean isfromtable)
	{
		setIsFromTable(getContext(), isfromtable);
	}

	/**
	 * Set value of IsFromTable
	 * @param context
	 * @param isfromtable
	 */
	public final void setIsFromTable(com.mendix.systemwideinterfaces.core.IContext context, Boolean isfromtable)
	{
		getMendixObject().setValue(context, MemberNames.IsFromTable.toString(), isfromtable);
	}

	/**
	 * @return value of Token
	 */
	public final String getToken()
	{
		return getToken(getContext());
	}

	/**
	 * @param context
	 * @return value of Token
	 */
	public final String getToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Token.toString());
	}

	/**
	 * Set value of Token
	 * @param token
	 */
	public final void setToken(String token)
	{
		setToken(getContext(), token);
	}

	/**
	 * Set value of Token
	 * @param context
	 * @param token
	 */
	public final void setToken(com.mendix.systemwideinterfaces.core.IContext context, String token)
	{
		getMendixObject().setValue(context, MemberNames.Token.toString(), token);
	}

	/**
	 * @return value of AdditionalJoins_TableMapping
	 */
	public final databasereplication.proxies.TableMapping getAdditionalJoins_TableMapping() throws com.mendix.core.CoreException
	{
		return getAdditionalJoins_TableMapping(getContext());
	}

	/**
	 * @param context
	 * @return value of AdditionalJoins_TableMapping
	 */
	public final databasereplication.proxies.TableMapping getAdditionalJoins_TableMapping(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.TableMapping result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AdditionalJoins_TableMapping.toString());
		if (identifier != null)
			result = databasereplication.proxies.TableMapping.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AdditionalJoins_TableMapping
	 * @param additionaljoins_tablemapping
	 */
	public final void setAdditionalJoins_TableMapping(databasereplication.proxies.TableMapping additionaljoins_tablemapping)
	{
		setAdditionalJoins_TableMapping(getContext(), additionaljoins_tablemapping);
	}

	/**
	 * Set value of AdditionalJoins_TableMapping
	 * @param context
	 * @param additionaljoins_tablemapping
	 */
	public final void setAdditionalJoins_TableMapping(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.TableMapping additionaljoins_tablemapping)
	{
		if (additionaljoins_tablemapping == null)
			getMendixObject().setValue(context, MemberNames.AdditionalJoins_TableMapping.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AdditionalJoins_TableMapping.toString(), additionaljoins_tablemapping.getMendixObject().getId());
	}

	/**
	 * @return value of AdditionalJoins_Table_Right
	 */
	public final databasereplication.proxies.Table getAdditionalJoins_Table_Right() throws com.mendix.core.CoreException
	{
		return getAdditionalJoins_Table_Right(getContext());
	}

	/**
	 * @param context
	 * @return value of AdditionalJoins_Table_Right
	 */
	public final databasereplication.proxies.Table getAdditionalJoins_Table_Right(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.Table result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AdditionalJoins_Table_Right.toString());
		if (identifier != null)
			result = databasereplication.proxies.Table.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AdditionalJoins_Table_Right
	 * @param additionaljoins_table_right
	 */
	public final void setAdditionalJoins_Table_Right(databasereplication.proxies.Table additionaljoins_table_right)
	{
		setAdditionalJoins_Table_Right(getContext(), additionaljoins_table_right);
	}

	/**
	 * Set value of AdditionalJoins_Table_Right
	 * @param context
	 * @param additionaljoins_table_right
	 */
	public final void setAdditionalJoins_Table_Right(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.Table additionaljoins_table_right)
	{
		if (additionaljoins_table_right == null)
			getMendixObject().setValue(context, MemberNames.AdditionalJoins_Table_Right.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AdditionalJoins_Table_Right.toString(), additionaljoins_table_right.getMendixObject().getId());
	}

	/**
	 * @return value of AdditionalJoins_AdditionalJoins_Left
	 */
	public final databasereplication.proxies.AdditionalJoins getAdditionalJoins_AdditionalJoins_Left() throws com.mendix.core.CoreException
	{
		return getAdditionalJoins_AdditionalJoins_Left(getContext());
	}

	/**
	 * @param context
	 * @return value of AdditionalJoins_AdditionalJoins_Left
	 */
	public final databasereplication.proxies.AdditionalJoins getAdditionalJoins_AdditionalJoins_Left(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.AdditionalJoins result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AdditionalJoins_AdditionalJoins_Left.toString());
		if (identifier != null)
			result = databasereplication.proxies.AdditionalJoins.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AdditionalJoins_AdditionalJoins_Left
	 * @param additionaljoins_additionaljoins_left
	 */
	public final void setAdditionalJoins_AdditionalJoins_Left(databasereplication.proxies.AdditionalJoins additionaljoins_additionaljoins_left)
	{
		setAdditionalJoins_AdditionalJoins_Left(getContext(), additionaljoins_additionaljoins_left);
	}

	/**
	 * Set value of AdditionalJoins_AdditionalJoins_Left
	 * @param context
	 * @param additionaljoins_additionaljoins_left
	 */
	public final void setAdditionalJoins_AdditionalJoins_Left(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.AdditionalJoins additionaljoins_additionaljoins_left)
	{
		if (additionaljoins_additionaljoins_left == null)
			getMendixObject().setValue(context, MemberNames.AdditionalJoins_AdditionalJoins_Left.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AdditionalJoins_AdditionalJoins_Left.toString(), additionaljoins_additionaljoins_left.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return additionalJoinsMendixObject;
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
			final databasereplication.proxies.AdditionalJoins that = (databasereplication.proxies.AdditionalJoins) obj;
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
		return "DatabaseReplication.AdditionalJoins";
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
