package artifacts;

import templates.ArtifactTemplate;
import types.ArtifactType;

public class Artifact {
	// mandatory
	public String name;
	public ArtifactType artifactType;

	// optional
	public ArtifactTemplate artifactRef;

	public Artifact(String name, ArtifactType artifactType) {
		this.name = name;
		this.artifactType = artifactType;
	}
}
