# Ris-Builder

A simple library that helps to build RIS files.

The RIS file (.ris) built using this library is recognized by the EndNote X7 desktop application. This allows a user to directly import the RIS file into his/her EndNote application.  More information on how to export to the EndNote desktop application using the RIS format can be found here:  http://endnote.com/kb/111599.  

## Requirements

Java 1.4 or higher
##How to build

```
mvn clean install
```

## Sample Usage

```java

import edu.bcm.dldcc.big.ris.RisBuilder;
...
RisBuilder builder = new RisBuilder();
builder.setTY("DATA")
       .setA2("Nuclear Receptor Signaling Atlas (NURSA)")
       .setDB("Nuclear Receptor Signaling Atlas Datasets")
       .setDP("Nuclear Receptor Signaling Atlas")
       .setPB("Nuclear Receptor Signaling Atlas")
       .setLA("English")
       .setY2((new SimpleDateFormat("MMM dd, yyyy")).format(new Date()));
// set all the fields to what you need
...
// write to file
try (BufferedWriter buffer = new BufferedWriter(new FileWriter(...))) {
    buffer.write(builder.generateString());
} catch (IOException e) {
    e.printStackTrace();
}
```

## Mapping of RIS fields to EndNote


| Ris Tag  |Requirement Definition|
|----------|----------------------|
|TY | Type of reference.  This must contain the abbreviation for the reference type as provided by EndNote. This will determine how all other fields are interpreted. This must be the first tag of each reference. In our example the type of reference is a dataset, therefore TY=DATA.
|ER| The end of the reference.  This must be the last tag in a reference.
|A2| The producer.  This field stores the company, conference, institution or organization responsible for publishing the work. For theses, this field is labeled and used for the University.
|A4|The funding agency.
|AB|The abstract.  This field stores the summary of the full text version.  In our example, we use this field to store the dataset description.
|AD|The author address.
|AN|The accession number.  This field stores the unique identifying number assigned to a reference by an online database.
|AU|Authors, editors and/or translators. Each author, editor, or translator must be on its own line, preceded by the AU tag.  This field stores the author or authors responsible for the source of work.
|C1|Time period.
|C2|Unit of observation.
|C4|Dataset(s).
|CA|Caption.  This field stores the description of a figure, image or illustration.
|CN|Call number.  This field stores the code assigned by the library holding the source information.
|CY|City.  This field stores the city or location of publication.
|DA|Date of collection.  
|DB|Name of database.  The name of database field contains the name or names of the databases from which the references within the body of the file were generated. Some providers maintain only one database; if so, the “Name of Database:” field may be omitted from the header. If the provider maintains multiple databases, but all references in the body of the file were drawn from a single database, the name of the database should be included. 
|DO|DOI.  This field stores a unique alphanumeric string assigned by a registration agency to identify the dataset record and provide a persistent link to its location on the Internet.
|DP|Database provider.  The database provider field contains the name for the organization responsible for generating the dataset.
|ET|Version.  This field stores the version number of the dataset.
|J2|Abbreviation.  
|KW|Keywords. Each keyword or phrase must be on its own line, preceded by the KW tag. A keyword can consist of multiple words (phrases) and can be up to 255 characters long.  This field stores the terms relevant to the reference, which can associate groups of references for specific topics.
|L1|File attachments.
|L4|Figure.
|LA|Language.  This field is defined as the language of the original publication.
|LB|Label.  This multi-purpose field can be used to store additional information.
|N1|Notes. Each note must be on its own line, preceded by the N1 tag. A note can consist of multiple words (phrases) and can be up to 255 characters long.  This field stores miscellaneous notes about the reference.
|NV|Study number.
|OP|Version history.
|PB|Distributor.  This field is defined as the name of the organization distributing the dataset.
|PY|Publication year.  This field stores the year of publication or release.  In our example, we use this field to store the publication year of the original publication.
|RI|Geographic coverage.
|RN|Research notes.
|SE|Original release date.  This field stores the date of when the dataset was loaded into the NURSA3 database.
|SN|ISSN.  ISSN (International Standard Serial Number) is a unique identifying code assigned to a serial publication or periodical, such as a journal.
|ST|Short title.
|T3|Series title.
|TA|Translated author.
|TI|Title.  This field stores the title of the source material. This is the primary title of the source.  In our example, we use this field to store the title of the dataset.
|TT|Translated title.
|UR|URL.  This field stores the Uniform Resource Locator, or address for the source.
|Y2|Access date.  This field stores the date of access to an electronic source.

## License

Distributed under the [BSD3 License] (http://opensource.org/licenses/BSD-3-Clause)
