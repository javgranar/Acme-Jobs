
package acme.entities.announcements;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(indexes = {
	@Index(columnList = "moment")
})
public class Announcement extends DomainEntity {

	//serialisation identifier
	private static final long	serialVersionUID	= 1L;

	//atributos
	@NotBlank
	private String				title;

	@NotBlank
	private String				text;

	@URL
	private String				moreInfo;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

}
