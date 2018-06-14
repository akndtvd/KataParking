package kataparking.model;

public class Parking {

	private String ID;
	private String NOM_PARC;
	private String ADRESS_SSC;
	private String ACCES_VL;
	private String Arrdt;
	private String DELEG;
	private String SITE_DELEG;
	private String TEL;
	private String H_PARC_CM;
	private String TYPE_PARC;
	private String HORAIRE_NA;
	private String ASC_SURF;
	private String ACCES_MOTO;
	private String ACCES_VELO;
	private String V_ELEC_CH;
	private String AUTOPART;
	private String geo_shape;
	private String geo_point_2d;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNOM_PARC() {
		return NOM_PARC;
	}

	public void setNOM_PARC(String nOM_PARC) {
		NOM_PARC = nOM_PARC;
	}

	public String getADRESS_SSC() {
		return ADRESS_SSC;
	}

	public void setADRESS_SSC(String aDRESS_SSC) {
		ADRESS_SSC = aDRESS_SSC;
	}

	public String getACCES_VL() {
		return ACCES_VL;
	}

	public void setACCES_VL(String aCCES_VL) {
		ACCES_VL = aCCES_VL;
	}

	public String getArrdt() {
		return Arrdt;
	}

	public void setArrdt(String arrdt) {
		Arrdt = arrdt;
	}

	public String getDELEG() {
		return DELEG;
	}

	public void setDELEG(String dELEG) {
		DELEG = dELEG;
	}

	public String getSITE_DELEG() {
		return SITE_DELEG;
	}

	public void setSITE_DELEG(String sITE_DELEG) {
		SITE_DELEG = sITE_DELEG;
	}

	public String getTEL() {
		return TEL;
	}

	public void setTEL(String tEL) {
		TEL = tEL;
	}

	public String getH_PARC_CM() {
		return H_PARC_CM;
	}

	public void setH_PARC_CM(String h_PARC_CM) {
		H_PARC_CM = h_PARC_CM;
	}

	public String getTYPE_PARC() {
		return TYPE_PARC;
	}

	public void setTYPE_PARC(String tYPE_PARC) {
		TYPE_PARC = tYPE_PARC;
	}

	public String getHORAIRE_NA() {
		return HORAIRE_NA;
	}

	public void setHORAIRE_NA(String hORAIRE_NA) {
		HORAIRE_NA = hORAIRE_NA;
	}

	public String getASC_SURF() {
		return ASC_SURF;
	}

	public void setASC_SURF(String aSC_SURF) {
		ASC_SURF = aSC_SURF;
	}

	public String getACCES_MOTO() {
		return ACCES_MOTO;
	}

	public void setACCES_MOTO(String aCCES_MOTO) {
		ACCES_MOTO = aCCES_MOTO;
	}

	public String getACCES_VELO() {
		return ACCES_VELO;
	}

	public void setACCES_VELO(String aCCES_VELO) {
		ACCES_VELO = aCCES_VELO;
	}

	public String getV_ELEC_CH() {
		return V_ELEC_CH;
	}

	public void setV_ELEC_CH(String v_ELEC_CH) {
		V_ELEC_CH = v_ELEC_CH;
	}

	public String getAUTOPART() {
		return AUTOPART;
	}

	public void setAUTOPART(String aUTOPART) {
		AUTOPART = aUTOPART;
	}

	public String getGeo_shape() {
		return geo_shape;
	}

	public void setGeo_shape(String geo_shape) {
		this.geo_shape = geo_shape;
	}

	public String getGeo_point_2d() {
		return geo_point_2d;
	}

	public void setGeo_point_2d(String geo_point_2d) {
		this.geo_point_2d = geo_point_2d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((NOM_PARC == null) ? 0 : NOM_PARC.hashCode());
		result = prime * result + ((geo_point_2d == null) ? 0 : geo_point_2d.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (NOM_PARC == null) {
			if (other.NOM_PARC != null)
				return false;
		} else if (!NOM_PARC.equals(other.NOM_PARC))
			return false;
		if (geo_point_2d == null) {
			if (other.geo_point_2d != null)
				return false;
		} else if (!geo_point_2d.equals(other.geo_point_2d))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return NOM_PARC	;	
	}
	
	
}
