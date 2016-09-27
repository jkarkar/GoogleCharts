// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public enum ImportAction
{
	Create(new String[][] { new String[] { "en_US", "Create all objects" }, new String[] { "nl_NL", "Maak alles aan" }, new String[] { "en_GB", "Create all objects" }, new String[] { "en_ZA", "Create all objects" } }),
	Synchronize(new String[][] { new String[] { "en_US", "Synchronize and create if objects are not found" }, new String[] { "nl_NL", "Synchroniseer en creeër wanneer niet gevonden" }, new String[] { "en_GB", "Synchronize and create if objects are not found" }, new String[] { "en_ZA", "Synchronize and create if objects are not found" } }),
	SynchronizeOnlyExisting(new String[][] { new String[] { "en_US", "Synchronize only existing objects, ignore others" }, new String[] { "nl_NL", "Synchroniseer alleen bestaande objecten, negeer de rest" }, new String[] { "en_GB", "Synchronize only existing objects, ignore others" }, new String[] { "en_ZA", "Synchronize only existing objects, ignore others" } }),
	OnlyCreateNewObjects(new String[][] { new String[] { "en_US", "Only create new objects" }, new String[] { "nl_NL", "Maak alleen niet bestaande objecten" }, new String[] { "en_GB", "Only create new objects" }, new String[] { "en_ZA", "Only create new objects" } });

	private java.util.Map<String,String> captions;

	private ImportAction(String[][] captionStrings)
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
