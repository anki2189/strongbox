package org.carlspring.strongbox.artifact.metadata;

import org.carlspring.strongbox.data.domain.GenericEntity;
import org.carlspring.strongbox.domain.ArtifactEntry;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * 
 * @author ankit.tomar
 *
 */
@Entity
public abstract class ArtifactMetadata extends GenericEntity
{

    private String name;

    private String version;

    @OneToOne
    private ArtifactEntry artifactEntry;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public ArtifactEntry getArtifactEntry()
    {
        return artifactEntry;
    }

    public void setArtifactEntry(ArtifactEntry artifactEntry)
    {
        this.artifactEntry = artifactEntry;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((artifactEntry == null) ? 0 : artifactEntry.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
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
        ArtifactMetadata other = (ArtifactMetadata) obj;
        if (artifactEntry == null)
        {
            if (other.artifactEntry != null)
                return false;
        }
        else if (!artifactEntry.equals(other.artifactEntry))
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (version == null)
        {
            if (other.version != null)
                return false;
        }
        else if (!version.equals(other.version))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "ArtifactMetadata [name=" + name + ", version=" + version + "]";
    }

}
