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
public class MxObjectEnumCaptions
{
	private final IMendixObject mxObjectEnumCaptionsMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MxModelReflection.MxObjectEnumCaptions";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Caption("Caption"),
		LanguageCode("LanguageCode"),
		LanguageName("LanguageName");

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

	public MxObjectEnumCaptions(IContext context)
	{
		this(context, Core.instantiate(context, "MxModelReflection.MxObjectEnumCaptions"));
	}

	protected MxObjectEnumCaptions(IContext context, IMendixObject mxObjectEnumCaptionsMendixObject)
	{
		if (mxObjectEnumCaptionsMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MxModelReflection.MxObjectEnumCaptions", mxObjectEnumCaptionsMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MxModelReflection.MxObjectEnumCaptions");

		this.mxObjectEnumCaptionsMendixObject = mxObjectEnumCaptionsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxObjectEnumCaptions.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.MxObjectEnumCaptions initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return mxmodelreflection.proxies.MxObjectEnumCaptions.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.MxObjectEnumCaptions initialize(IContext context, IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.MxObjectEnumCaptions(context, mendixObject);
	}

	public static mxmodelreflection.proxies.MxObjectEnumCaptions load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.MxObjectEnumCaptions.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.MxObjectEnumCaptions> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectEnumCaptions> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectEnumCaptions>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MxModelReflection.MxObjectEnumCaptions" + xpathConstraint))
			result.add(mxmodelreflection.proxies.MxObjectEnumCaptions.initialize(context, obj));
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
	 * @return value of Caption
	 */
	public final String getCaption()
	{
		return getCaption(getContext());
	}

	/**
	 * @param context
	 * @return value of Caption
	 */
	public final String getCaption(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Caption.toString());
	}

	/**
	 * Set value of Caption
	 * @param caption
	 */
	public final void setCaption(String caption)
	{
		setCaption(getContext(), caption);
	}

	/**
	 * Set value of Caption
	 * @param context
	 * @param caption
	 */
	public final void setCaption(IContext context, String caption)
	{
		getMendixObject().setValue(context, MemberNames.Caption.toString(), caption);
	}

	/**
	 * @return value of LanguageCode
	 */
	public final String getLanguageCode()
	{
		return getLanguageCode(getContext());
	}

	/**
	 * @param context
	 * @return value of LanguageCode
	 */
	public final String getLanguageCode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.LanguageCode.toString());
	}

	/**
	 * Set value of LanguageCode
	 * @param languagecode
	 */
	public final void setLanguageCode(String languagecode)
	{
		setLanguageCode(getContext(), languagecode);
	}

	/**
	 * Set value of LanguageCode
	 * @param context
	 * @param languagecode
	 */
	public final void setLanguageCode(IContext context, String languagecode)
	{
		getMendixObject().setValue(context, MemberNames.LanguageCode.toString(), languagecode);
	}

	/**
	 * @return value of LanguageName
	 */
	public final String getLanguageName()
	{
		return getLanguageName(getContext());
	}

	/**
	 * @param context
	 * @return value of LanguageName
	 */
	public final String getLanguageName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.LanguageName.toString());
	}

	/**
	 * Set value of LanguageName
	 * @param languagename
	 */
	public final void setLanguageName(String languagename)
	{
		setLanguageName(getContext(), languagename);
	}

	/**
	 * Set value of LanguageName
	 * @param context
	 * @param languagename
	 */
	public final void setLanguageName(IContext context, String languagename)
	{
		getMendixObject().setValue(context, MemberNames.LanguageName.toString(), languagename);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return mxObjectEnumCaptionsMendixObject;
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
			final mxmodelreflection.proxies.MxObjectEnumCaptions that = (mxmodelreflection.proxies.MxObjectEnumCaptions) obj;
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
		return "MxModelReflection.MxObjectEnumCaptions";
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