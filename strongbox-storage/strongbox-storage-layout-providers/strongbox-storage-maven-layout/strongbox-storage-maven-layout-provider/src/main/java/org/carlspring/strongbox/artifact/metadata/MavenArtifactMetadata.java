package org.carlspring.strongbox.artifact.metadata;

import javax.persistence.Entity;

import java.util.Set;

/**
 * This class is implementation of {@link ArtifactMetadata} for maven
 * 
 * @author ankit.tomar
 *
 */
@Entity
public class MavenArtifactMetadata extends ArtifactMetadata
{
    private String description;

    private String url;

    private String inceptionYear;

    private Set<String> licenses;

    private String organization;

    private Set<String> developers;

    private Set<String> contributors;

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getInceptionYear()
    {
        return inceptionYear;
    }

    public void setInceptionYear(String inceptionYear)
    {
        this.inceptionYear = inceptionYear;
    }

    public Set<String> getLicenses()
    {
        return licenses;
    }

    public void setLicenses(Set<String> licenses)
    {
        this.licenses = licenses;
    }

    public String getOrganization()
    {
        return organization;
    }

    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public Set<String> getDevelopers()
    {
        return developers;
    }

    public void setDevelopers(Set<String> developers)
    {
        this.developers = developers;
    }

    public Set<String> getContributors()
    {
        return contributors;
    }

    public void setContributors(Set<String> contributors)
    {
        this.contributors = contributors;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((contributors == null) ? 0 : contributors.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((developers == null) ? 0 : developers.hashCode());
        result = prime * result + ((inceptionYear == null) ? 0 : inceptionYear.hashCode());
        result = prime * result + ((licenses == null) ? 0 : licenses.hashCode());
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        MavenArtifactMetadata other = (MavenArtifactMetadata) obj;
        if (contributors == null)
        {
            if (other.contributors != null)
                return false;
        }
        else if (!contributors.equals(other.contributors))
            return false;
        if (description == null)
        {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (developers == null)
        {
            if (other.developers != null)
                return false;
        }
        else if (!developers.equals(other.developers))
            return false;
        if (inceptionYear == null)
        {
            if (other.inceptionYear != null)
                return false;
        }
        else if (!inceptionYear.equals(other.inceptionYear))
            return false;
        if (licenses == null)
        {
            if (other.licenses != null)
                return false;
        }
        else if (!licenses.equals(other.licenses))
            return false;
        if (organization == null)
        {
            if (other.organization != null)
                return false;
        }
        else if (!organization.equals(other.organization))
            return false;
        if (url == null)
        {
            if (other.url != null)
                return false;
        }
        else if (!url.equals(other.url))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "MavenArtifactMetadata [description=" + description + ", url=" + url + ", inceptionYear=" + inceptionYear
                + ", licenses=" + licenses + ", organization=" + organization + ", developers=" + developers
                + ", contributors=" + contributors + "]";
    }

}
