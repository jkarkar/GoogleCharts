// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class DbSizeEstimate
{
	private final IMendixObject dbSizeEstimateMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MxModelReflection.DbSizeEstimate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NrOfRecords("NrOfRecords"),
		CalculatedSizeInBytes("CalculatedSizeInBytes"),
		CalculatedSizeInKiloBytes("CalculatedSizeInKiloBytes"),
		FindObjectType("FindObjectType"),
		DbSizeEstimate_MxObjectType("MxModelReflection.DbSizeEstimate_MxObjectType");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public DbSizeEstimate(IContext context)
	{
		this(context, Core.instantiate(context, "MxModelReflection.DbSizeEstimate"));
	}

	protected DbSizeEstimate(IContext context, IMendixObject dbSizeEstimateMendixObject)
	{
		if (dbSizeEstimateMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MxModelReflection.DbSizeEstimate", dbSizeEstimateMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MxModelReflection.DbSizeEstimate");

		this.dbSizeEstimateMendixObject = dbSizeEstimateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DbSizeEstimate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.DbSizeEstimate initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return mxmodelreflection.proxies.DbSizeEstimate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.DbSizeEstimate initialize(IContext context, IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.DbSizeEstimate(context, mendixObject);
	}

	public static mxmodelreflection.proxies.DbSizeEstimate load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.DbSizeEstimate.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.DbSizeEstimate> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.DbSizeEstimate> result = new java.util.ArrayList<mxmodelreflection.proxies.DbSizeEstimate>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MxModelReflection.DbSizeEstimate" + xpathConstraint))
			result.add(mxmodelreflection.proxies.DbSizeEstimate.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of NrOfRecords
	 */
	public final Integer getNrOfRecords()
	{
		return getNrOfRecords(getContext());
	}

	/**
	 * @param context
	 * @return value of NrOfRecords
	 */
	public final Integer getNrOfRecords(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.NrOfRecords.toString());
	}

	/**
	 * Set value of NrOfRecords
	 * @param nrofrecords
	 */
	public final void setNrOfRecords(Integer nrofrecords)
	{
		setNrOfRecords(getContext(), nrofrecords);
	}

	/**
	 * Set value of NrOfRecords
	 * @param context
	 * @param nrofrecords
	 */
	public final void setNrOfRecords(IContext context, Integer nrofrecords)
	{
		getMendixObject().setValue(context, MemberNames.NrOfRecords.toString(), nrofrecords);
	}

	/**
	 * @return value of CalculatedSizeInBytes
	 */
	public final Long getCalculatedSizeInBytes()
	{
		return getCalculatedSizeInBytes(getContext());
	}

	/**
	 * @param context
	 * @return value of CalculatedSizeInBytes
	 */
	public final Long getCalculatedSizeInBytes(IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.CalculatedSizeInBytes.toString());
	}

	/**
	 * Set value of CalculatedSizeInBytes
	 * @param calculatedsizeinbytes
	 */
	public final void setCalculatedSizeInBytes(Long calculatedsizeinbytes)
	{
		setCalculatedSizeInBytes(getContext(), calculatedsizeinbytes);
	}

	/**
	 * Set value of CalculatedSizeInBytes
	 * @param context
	 * @param calculatedsizeinbytes
	 */
	public final void setCalculatedSizeInBytes(IContext context, Long calculatedsizeinbytes)
	{
		getMendixObject().setValue(context, MemberNames.CalculatedSizeInBytes.toString(), calculatedsizeinbytes);
	}

	/**
	 * @return value of CalculatedSizeInKiloBytes
	 */
	public final Long getCalculatedSizeInKiloBytes()
	{
		return getCalculatedSizeInKiloBytes(getContext());
	}

	/**
	 * @param context
	 * @return value of CalculatedSizeInKiloBytes
	 */
	public final Long getCalculatedSizeInKiloBytes(IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.CalculatedSizeInKiloBytes.toString());
	}

	/**
	 * Set value of CalculatedSizeInKiloBytes
	 * @param calculatedsizeinkilobytes
	 */
	public final void setCalculatedSizeInKiloBytes(Long calculatedsizeinkilobytes)
	{
		setCalculatedSizeInKiloBytes(getContext(), calculatedsizeinkilobytes);
	}

	/**
	 * Set value of CalculatedSizeInKiloBytes
	 * @param context
	 * @param calculatedsizeinkilobytes
	 */
	public final void setCalculatedSizeInKiloBytes(IContext context, Long calculatedsizeinkilobytes)
	{
		getMendixObject().setValue(context, MemberNames.CalculatedSizeInKiloBytes.toString(), calculatedsizeinkilobytes);
	}

	/**
	 * @return value of FindObjectType
	 */
	public final String getFindObjectType()
	{
		return getFindObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of FindObjectType
	 */
	public final String getFindObjectType(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FindObjectType.toString());
	}

	/**
	 * Set value of FindObjectType
	 * @param findobjecttype
	 */
	public final void setFindObjectType(String findobjecttype)
	{
		setFindObjectType(getContext(), findobjecttype);
	}

	/**
	 * Set value of FindObjectType
	 * @param context
	 * @param findobjecttype
	 */
	public final void setFindObjectType(IContext context, String findobjecttype)
	{
		getMendixObject().setValue(context, MemberNames.FindObjectType.toString(), findobjecttype);
	}

	/**
	 * @return value of DbSizeEstimate_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getDbSizeEstimate_MxObjectType() throws CoreException
	{
		return getDbSizeEstimate_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of DbSizeEstimate_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getDbSizeEstimate_MxObjectType(IContext context) throws CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DbSizeEstimate_MxObjectType.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DbSizeEstimate_MxObjectType
	 * @param dbsizeestimate_mxobjecttype
	 */
	public final void setDbSizeEstimate_MxObjectType(mxmodelreflection.proxies.MxObjectType dbsizeestimate_mxobjecttype)
	{
		setDbSizeEstimate_MxObjectType(getContext(), dbsizeestimate_mxobjecttype);
	}

	/**
	 * Set value of DbSizeEstimate_MxObjectType
	 * @param context
	 * @param dbsizeestimate_mxobjecttype
	 */
	public final void setDbSizeEstimate_MxObjectType(IContext context, mxmodelreflection.proxies.MxObjectType dbsizeestimate_mxobjecttype)
	{
		if (dbsizeestimate_mxobjecttype == null)
			getMendixObject().setValue(context, MemberNames.DbSizeEstimate_MxObjectType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DbSizeEstimate_MxObjectType.toString(), dbsizeestimate_mxobjecttype.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return dbSizeEstimateMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
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
			final mxmodelreflection.proxies.DbSizeEstimate that = (mxmodelreflection.proxies.DbSizeEstimate) obj;
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
	public static String getType()
	{
		return "MxModelReflection.DbSizeEstimate";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}