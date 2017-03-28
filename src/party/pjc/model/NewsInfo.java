package party.pjc.model;

public class NewsInfo {
    private Integer nid;

    private String nauthor;

    private String ncontent;

    private String ncreatedate;

    private String nmodifydate;

    private String npicpath;

    private String nsummary;

    private Integer ntid;

    private String ntitle;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor == null ? null : nauthor.trim();
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent == null ? null : ncontent.trim();
    }

    public String getNcreatedate() {
        return ncreatedate;
    }

    public void setNcreatedate(String ncreatedate) {
        this.ncreatedate = ncreatedate == null ? null : ncreatedate.trim();
    }

    public String getNmodifydate() {
        return nmodifydate;
    }

    public void setNmodifydate(String nmodifydate) {
        this.nmodifydate = nmodifydate == null ? null : nmodifydate.trim();
    }

    public String getNpicpath() {
        return npicpath;
    }

    public void setNpicpath(String npicpath) {
        this.npicpath = npicpath == null ? null : npicpath.trim();
    }

    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary == null ? null : nsummary.trim();
    }

    public Integer getNtid() {
        return ntid;
    }

    public void setNtid(Integer ntid) {
        this.ntid = ntid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

	@Override
	public String toString() {
		return "NewsInfo [nid=" + nid + ", nauthor=" + nauthor + ", ncontent=" + ncontent + ", ncreatedate="
				+ ncreatedate + ", nmodifydate=" + nmodifydate + ", npicpath=" + npicpath + ", nsummary=" + nsummary
				+ ", ntid=" + ntid + ", ntitle=" + ntitle + "]";
	}
    
    
}