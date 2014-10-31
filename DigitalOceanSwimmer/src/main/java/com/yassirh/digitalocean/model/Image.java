package com.yassirh.digitalocean.model;

public class Image {
	
	private long id;
	private String name;
	private String distribution;
	private String slug;
	private Boolean isPublic;
    private boolean notInUse;
    private String minSize;
    private String regions;

    public Image(){
	}
	
	public Image(long id, String name, String distribution, String slug, Boolean isPublic, String regions, String minSize) {
		this.id = id;
		this.name = name;
		this.distribution = distribution;
        this.slug = slug;
		this.isPublic = isPublic;
        this.regions = regions;
        this.minSize = minSize;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistribution() {
		return distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Boolean isPublic() {
		return isPublic;
	}

	public void setPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

    public void setInUse(boolean notInUse) {
        this.notInUse = notInUse;
    }

    public boolean isInUse() {
        return notInUse;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getMinSize() {
        return minSize;
    }

    public void setMinSize(String minSize) {
        this.minSize = minSize;
    }
}
