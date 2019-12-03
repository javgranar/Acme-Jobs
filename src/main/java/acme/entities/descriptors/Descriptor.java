
package acme.entities.descriptors;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.jobs.Job;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Descriptor extends DomainEntity {

	//serialisation identifier

	private static final long serialVersionUID = 1L;

	//atributos
	@NotBlank
	private String jobDescription;

	// Relationships ---------------------------------------
	@NotNull
	@Valid
	@OneToOne(optional = false)
	private Job job;

}
