// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies;

public class Sensor
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sensorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestSuite.Sensor";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UTC("UTC"),
		_Type("_Type"),
		Level("Level"),
		Gateway("Gateway"),
		NodeID("NodeID"),
		Seal_State("Seal_State");

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

	public Sensor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestSuite.Sensor"));
	}

	protected Sensor(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sensorMendixObject)
	{
		if (sensorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestSuite.Sensor", sensorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestSuite.Sensor");

		this.sensorMendixObject = sensorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Sensor.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testsuite.proxies.Sensor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testsuite.proxies.Sensor.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testsuite.proxies.Sensor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testsuite.proxies.Sensor(context, mendixObject);
	}

	public static testsuite.proxies.Sensor load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testsuite.proxies.Sensor.initialize(context, mendixObject);
	}

	public static java.util.List<testsuite.proxies.Sensor> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testsuite.proxies.Sensor> result = new java.util.ArrayList<testsuite.proxies.Sensor>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestSuite.Sensor" + xpathConstraint))
			result.add(testsuite.proxies.Sensor.initialize(context, obj));
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
	 * @return value of UTC
	 */
	public final java.lang.Long getUTC()
	{
		return getUTC(getContext());
	}

	/**
	 * @param context
	 * @return value of UTC
	 */
	public final java.lang.Long getUTC(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.UTC.toString());
	}

	/**
	 * Set value of UTC
	 * @param utc
	 */
	public final void setUTC(java.lang.Long utc)
	{
		setUTC(getContext(), utc);
	}

	/**
	 * Set value of UTC
	 * @param context
	 * @param utc
	 */
	public final void setUTC(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long utc)
	{
		getMendixObject().setValue(context, MemberNames.UTC.toString(), utc);
	}

	/**
	 * @return value of _Type
	 */
	public final java.lang.String get_Type()
	{
		return get_Type(getContext());
	}

	/**
	 * @param context
	 * @return value of _Type
	 */
	public final java.lang.String get_Type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._Type.toString());
	}

	/**
	 * Set value of _Type
	 * @param _type
	 */
	public final void set_Type(java.lang.String _type)
	{
		set_Type(getContext(), _type);
	}

	/**
	 * Set value of _Type
	 * @param context
	 * @param _type
	 */
	public final void set_Type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _type)
	{
		getMendixObject().setValue(context, MemberNames._Type.toString(), _type);
	}

	/**
	 * @return value of Level
	 */
	public final java.math.BigDecimal getLevel()
	{
		return getLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of Level
	 */
	public final java.math.BigDecimal getLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Level.toString());
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final void setLevel(java.math.BigDecimal level)
	{
		setLevel(getContext(), level);
	}

	/**
	 * Set value of Level
	 * @param context
	 * @param level
	 */
	public final void setLevel(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal level)
	{
		getMendixObject().setValue(context, MemberNames.Level.toString(), level);
	}

	/**
	 * @return value of Gateway
	 */
	public final java.lang.String getGateway()
	{
		return getGateway(getContext());
	}

	/**
	 * @param context
	 * @return value of Gateway
	 */
	public final java.lang.String getGateway(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Gateway.toString());
	}

	/**
	 * Set value of Gateway
	 * @param gateway
	 */
	public final void setGateway(java.lang.String gateway)
	{
		setGateway(getContext(), gateway);
	}

	/**
	 * Set value of Gateway
	 * @param context
	 * @param gateway
	 */
	public final void setGateway(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String gateway)
	{
		getMendixObject().setValue(context, MemberNames.Gateway.toString(), gateway);
	}

	/**
	 * @return value of NodeID
	 */
	public final java.lang.String getNodeID()
	{
		return getNodeID(getContext());
	}

	/**
	 * @param context
	 * @return value of NodeID
	 */
	public final java.lang.String getNodeID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NodeID.toString());
	}

	/**
	 * Set value of NodeID
	 * @param nodeid
	 */
	public final void setNodeID(java.lang.String nodeid)
	{
		setNodeID(getContext(), nodeid);
	}

	/**
	 * Set value of NodeID
	 * @param context
	 * @param nodeid
	 */
	public final void setNodeID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nodeid)
	{
		getMendixObject().setValue(context, MemberNames.NodeID.toString(), nodeid);
	}

	/**
	 * @return value of Seal_State
	 */
	public final java.lang.String getSeal_State()
	{
		return getSeal_State(getContext());
	}

	/**
	 * @param context
	 * @return value of Seal_State
	 */
	public final java.lang.String getSeal_State(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Seal_State.toString());
	}

	/**
	 * Set value of Seal_State
	 * @param seal_state
	 */
	public final void setSeal_State(java.lang.String seal_state)
	{
		setSeal_State(getContext(), seal_state);
	}

	/**
	 * Set value of Seal_State
	 * @param context
	 * @param seal_state
	 */
	public final void setSeal_State(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String seal_state)
	{
		getMendixObject().setValue(context, MemberNames.Seal_State.toString(), seal_state);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sensorMendixObject;
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
			final testsuite.proxies.Sensor that = (testsuite.proxies.Sensor) obj;
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
		return "TestSuite.Sensor";
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
