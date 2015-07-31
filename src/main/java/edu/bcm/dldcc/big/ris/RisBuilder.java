package edu.bcm.dldcc.big.ris;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by alexey on 6/29/15.
 */
public class RisBuilder {

    private Pattern allowedChars = Pattern.compile("^[\\u0020-\\u00FF]*$");

    // Type of reference (must be the first tag)
    private String TY;

    // Secondary Author/Producer
    private String A2;

    // Funding agency/Subsidiary Author
    private String A4;

    // Abstract from the publication
    private String AB;

    // Author Address
    private String AD;

    // Accession Number/DOI
    private String AN;

    // Authors
    private List<String> AU = new ArrayList<String>();

    // Time period
    private String C1;
    // unit of observation
    private String C2;
    private String C3;
    // dataset
    private String C4;

    // Caption
    private String CA;

    // Call Number
    private String CN;

    // Place Published City
    private String CY;

    // Date of collection
    private String DA;

    // Name of Database
    private String DB;

    // DO is defined as the DOI
    private String DO;

    // Database Provider
    private String DP;

    // Version/Edition
    private String ET;

    // abbreviation
    private String J2;

    // keyword  regulatory molecule(s), tissue/cell line(s))
    private Set<String> KW = new HashSet<String>();

    // File Attachments
    private String L1;

    // Figure
    private String L4;

    // Language
    private String LA;

    // label
    private String LB;

    // NOTES
    private List<String> N1 = new ArrayList<String>();

    // Number of Volumes
    private String NV;

    // Original Publication
    private String OP;

    // Publisher
    private String PB;

    // Year
    private String PY;

    // Reviewed Item
    private String RI;

    // Research Notes
    private String RN;

    // Section
    private String SE;

    // ISBN/ISSN
    private String SN;

    // Short Title
    private String ST;

    // series title
    private String T3;

    // Translated Author
    private String TA;

    // Title
    private String TI;

    // Translated Title
    private String TT;

    // URL
    private String UR;

    //  Access Date
    private String Y2;

    public String generateString() {
        StringBuilder builder = new StringBuilder();

        addRecord("TY",TY,builder);
        addRecord("A2", A2, builder);
        addRecord("A4", A4, builder);
        addRecord("AB", AB, builder);
        addRecord("AD", AD, builder);
        addRecord("AN", AN, builder);

        for(String s : AU) {
            addRecord("AU", s, builder);
        }

        addRecord("C1", C1, builder);
        addRecord("C2", C2, builder);
        addRecord("C3", C3, builder);
        addRecord("C4", C4, builder);
        addRecord("CA", CA, builder);
        addRecord("CN", CN, builder);
        addRecord("CY", CY, builder);
        addRecord("DA", DA, builder);
        addRecord("DB", DB, builder);
        addRecord("DO", DO, builder);
        addRecord("DP", DP, builder);
        addRecord("ET", ET, builder);
        addRecord("J2", J2, builder);

        for (String kw : KW) {
            addRecord("KW", kw, builder);
        }

        addRecord("L1", L1, builder);
        addRecord("L4", L4, builder);
        addRecord("LA", LA, builder);
        addRecord("LB", LB, builder);

        for (String n1 : N1) {
            addRecord("N1", n1, builder);
        }

        addRecord("NV", NV, builder);
        addRecord("OP", OP, builder);
        addRecord("PB", PB, builder);
        addRecord("PY", PY, builder);
        addRecord("RI", RI, builder);
        addRecord("RN", RN, builder);
        addRecord("SE", SE, builder);
        addRecord("SN", SN, builder);
        addRecord("ST", ST, builder);
        addRecord("T3", T3, builder);
        addRecord("TA", TA, builder);
        addRecord("TI", TI, builder);
        addRecord("TT", TT, builder);
        addRecord("UR", UR, builder);
        addRecord("Y2", Y2, builder);
        addRecord("ER", null, builder);

        return builder.toString();
    }

    private void addRecord (String name, String value, StringBuilder sb) {
        sb.append(name);
        sb.append("  - ");
        if (null != value&& !"".equals(value)) {
            sb.append(value);
        }
        sb.append("\r\n");
    }


    public String getA4() {
        return A4;
    }

    public RisBuilder setA4(String a4) {
        checkWhiteList(a4);
        A4 = a4;
        return this;
    }

    public String getAB() {
        return AB;
    }

    public String getAD() {
        return AD;
    }

    public RisBuilder setAD(String ad) {
        checkWhiteList(ad);
        this.AD = ad;
        return this;
    }

    public String getAN() {
        return AN;
    }

    public RisBuilder setAN(String an) {
        checkWhiteList(an);
        AN = an;
        return this;
    }

    public List<String> getAU() {
        return AU;
    }

    public RisBuilder setAU(List<String> AU) {
        this.AU = AU;
        return this;
    }

    public String getC1() {
        return C1;
    }

    public RisBuilder setC1(String c1) {
        checkWhiteList(c1);
        C1 = c1;
        return this;
    }

    public String getC2() {
        return C2;
    }

    public RisBuilder setC2(String c2) {
        checkWhiteList(c2);
        C2 = c2;
        return this;
    }

    public String getC3() {
        return C3;
    }

    public RisBuilder setC3(String c3) {
        checkWhiteList(c3);
        C3 = c3;
        return this;
    }

    public String getC4() {
        return C4;
    }

    public RisBuilder setC4(String c4) {
        checkWhiteList(c4);
        C4 = c4;
        return this;
    }

    public String getCA() {
        return CA;
    }

    public RisBuilder setCA(String ca) {
        checkWhiteList(ca);
        this.CA = ca;
        return this;
    }

    public String getCN() {
        return CN;
    }

    public RisBuilder setCN(String cn) {
        checkWhiteList(cn);
        this.CN = cn;
        return this;
    }

    public String getCY() {
        return CY;
    }

    public RisBuilder setCY(String cy) {
        checkWhiteList(cy);
        CY = cy;
        return this;
    }

    public String getDA() {
        return DA;
    }

    public RisBuilder setDA(String da) {
        checkWhiteList(da);
        DA = da;
        return this;
    }

    public String getDO() {
        return DO;
    }

    public String getJ2() {
        return J2;
    }

    public RisBuilder setJ2(String j2) {
        checkWhiteList(j2);
        J2 = j2;
        return this;
    }

    public Set<String> getKW() {
        return KW;
    }

    public RisBuilder setKW(Set<String> KW) {
        this.KW = KW;
        return this;
    }

    public String getL1() {
        return L1;
    }

    public RisBuilder setL1(String l1) {
        checkWhiteList(l1);
        L1 = l1;
        return this;
    }

    public String getL4() {
        return L4;
    }

    public RisBuilder setL4(String l4) {
        checkWhiteList(l4);
        L4 = l4;
        return this;
    }

    public String getLB() {
        return LB;
    }

    public RisBuilder setLB(String lb) {
        checkWhiteList(lb);
        this.LB = lb;
        return this;
    }

    public List<String> getN1() {
        return N1;
    }

    public RisBuilder setN1(List<String> n1) {
        N1 = n1;
        return this;
    }

    public String getNV() {
        return NV;
    }

    public RisBuilder setNV(String nv) {
        checkWhiteList(nv);
        this.NV = nv;
        return this;
    }

    public String getOP() {
        return OP;
    }

    public RisBuilder setOP(String op) {
        checkWhiteList(op);
        this.OP = op;
        return this;
    }

    public String getPY() {
        return PY;
    }

    public RisBuilder setPY(String py) {
        checkWhiteList(py);
        this.PY = py;
        return this;
    }

    public String getRI() {
        return RI;
    }

    public RisBuilder setRI(String RI) {
        checkWhiteList(RI);
        this.RI = RI;
        return this;
    }

    public String getRN() {
        return RN;
    }

    public RisBuilder setRN(String RN) {
        checkWhiteList(RN);
        this.RN = RN;
        return this;
    }

    public String getSN() {
        return SN;
    }

    public RisBuilder setSN(String sn) {
        checkWhiteList(sn);
        this.SN = sn;
        return this;
    }

    public String getST() {
        return ST;
    }

    public RisBuilder setST(String st) {
        checkWhiteList(st);
        this.ST = st;
        return this;
    }

    public String getT3() {
        return T3;
    }

    public RisBuilder setT3(String t3) {
        checkWhiteList(t3);
        T3 = t3;
        return this;
    }

    public String getTA() {
        return TA;
    }

    public RisBuilder setTA(String TA) {
        checkWhiteList(TA);
        this.TA = TA;
        return this;
    }

    public String getTI() {
        return TI;
    }

    public String getTT() {
        return TT;
    }

    public RisBuilder setTT(String TT) {
        checkWhiteList(TT);
        this.TT = TT;
        return this;
    }

    public String getUR() {
        return UR;
    }

    public String getY2() {
        return Y2;
    }

    public String getTY() {
        return TY;
    }

    /**
     * Sets the value of the TY
     * @param ty type of reference
     * @return reference to the object
     */
    public RisBuilder setTY(String ty) {
        checkWhiteList(ty);
        this.TY = ty;
        return this;
    }


    public String getA2() {
        return A2;
    }

    /**
     * Sets the value of the A2
     * @param a2 Secondary Author
     * @return reference to the object
     */
    public RisBuilder setA2(String a2) {
        checkWhiteList(a2);
        A2 = a2;
        return this;
    }

    public RisBuilder setAB(String ab) {
        checkWhiteList(ab);
        AB = ab;
        return this;
    }

    /**
     * Adds a new note to the list. Note: notes will be written to file in the order you add them.
     * @param n1
     * @return RisBuilder
     */
    public RisBuilder addNote(String n1) {
        checkWhiteList(n1);
        if (null != n1 && n1.length() > 255) {
            throw new IllegalArgumentException("");
        }
        N1.add(n1);
        return this;
    }

    /**
     * Adds a new author to the list. Note: authors will be written to file in the order you add them.
     * @param au author name
     * @return RisBuilder
     */
    public RisBuilder addAU(String au) {

        if (null == au) {
            throw new IllegalArgumentException("Author name cannot be null");
        }

        if (au.contains("*") ) {
            throw new IllegalArgumentException("Author name cannot contain * ");
        }
        checkWhiteList(au);
        AU.add(au);
        return this;
    }

    /**
     * Adds a new keyword to the list. Note: keywords will be written to file in the order you add them.
     * @param kw keyword to set
     * @return RisBuilder
     */
    public RisBuilder addKW(String kw) {
        checkWhiteList(kw);
        if (null != kw && kw.length() > 255) {
            throw new IllegalArgumentException("");
        }
        KW.add(kw);
        return this;
    }

    public String getLA() {
        return LA;
    }

    /**
     * Sets language
     * @param LA language
     * @return this
     */
    public RisBuilder setLA(String LA) {
        checkWhiteList(LA);
        this.LA = LA;
        return this;
    }

    public String getPB() {
        return PB;
    }

    /**
     * Sets publisher
     * @param pb publisher
     * @return this
     */
    public RisBuilder setPB(String pb) {
        checkWhiteList(pb);
        this.PB = pb;
        return this;
    }

    public String getTy() {
        return TY;
    }

    public RisBuilder setTy(String ty) {
        checkWhiteList(ty);
        TY = ty;
        return this;
    }

    public String getET() {
        return ET;
    }

    /**
     * Set edition/version
     * @param version version
     * @return RisBuilder
     */
    public RisBuilder setET(String version) {
        checkWhiteList(version);
        this.ET = version;
        return this;
    }

    public String getSE() {
        return SE;
    }

    public RisBuilder setSE(String se) {
        checkWhiteList(se);
        this.SE = se;
        return this;
    }

    public RisBuilder setDO(String doi) {
        checkWhiteList(doi);
        DO = doi;
        return this;
    }

    public String getDP() {
        return DP;
    }

    /**
     * Name of Database
     * @param dp Name of Database
     * @return this
     */
    public RisBuilder setDP(String dp) {
        checkWhiteList(dp);
        this.DP = dp;
        return this;
    }

    public String getDB() {
        return DB;
    }

    /**
     *
     * @param db -  Name of Database
     * @return this
     */
    public RisBuilder setDB(String db) {
        checkWhiteList(db);
        this.DB = db;
        return this;
    }
    /**
     * Title
     * @param title - title of the dataset
     * @return this
     */
    public RisBuilder setTI(String title) {
        checkWhiteList(title);
        TI = title;
        return this;
    }

    public RisBuilder setUR(String url) {
        checkWhiteList(url);
        UR = url;
        return this;
    }

    public RisBuilder setY2(String year) {
        checkWhiteList(year);
        Y2 = year;
        return this;
    }

    /**
     * Checks the str1 for illegal characters. if does not match whitelist throws  IllegalArgumentException
     * @param str1 string to check
     */

    private void checkWhiteList(String str1) {
        if (!allowedChars.matcher(str1).matches()) {
            throw new IllegalArgumentException("Illegal character in field: "+str1);
        }
    }
}
