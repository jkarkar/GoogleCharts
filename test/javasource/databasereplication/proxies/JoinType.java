// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public enum JoinType
{
	INNER(new String[][] { new String[] { "en_US", "Required (INNER)" }, new String[] { "nl_NL", "Verplicht (INNER)" }, new String[] { "en_GB", "Required (INNER)" }, new String[] { "en_ZA", "Required (INNER)" } }),
	LEFT(new String[][] { new String[] { "en_US", "As long as left side exists (LEFT)" }, new String[] { "nl_NL", "Als de linker kant bestaat (LEFT)" }, new String[] { "en_GB", "As long as left side exists (LEFT)" }, new String[] { "en_ZA", "As long as left side exists (LEFT)" } }),
	RIGHT(new String[][] { new String[] { "en_US", "As long as right side exists (RIGHT)" }, new String[] { "nl_NL", "Als de rechter kant bestaat (RIGHT)" }, new String[] { "en_GB", "As long as right side exists (RIGHT)" }, new String[] { "en_ZA", "As long as right side exists (RIGHT)" } }),
	LEFT_OUTER(new String[][] { new String[] { "en_US", "Only when left side exists and right side doesn't (LEFT OUTER)" }, new String[] { "nl_NL", "Alleen als de linker tabel bestaat en rechts niet bestaat (LEFT OUTER)" }, new String[] { "en_GB", "Only when left side exists and right side doesn't (LEFT OUTER)" }, new String[] { "en_ZA", "Only when left side exists and right side doesn't (LEFT OUTER)" } }),
	RIGHT_OUTER(new String[][] { new String[] { "en_US", "Only when right side exists and left side doesn't (RIGHT OUTER)" }, new String[] { "nl_NL", "Alleen als de rechter tabel bestaat en linker niet bestaat (LEFT OUTER)" }, new String[] { "en_GB", "Only when right side exists and left side doesn't (RIGHT OUTER)" }, new String[] { "en_ZA", "Only when right side exists and left side doesn't (RIGHT OUTER)" } }),
	FROM(new String[][] { new String[] { "en_US", "Addtional From table" }, new String[] { "nl_NL", "Extra tabel in From clause" }, new String[] { "en_GB", "Addtional From table" }, new String[] { "en_ZA", "Addtional From table" } });

	private java.util.Map<String,String> captions;

	private JoinType(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
