package ajbc.doodle.calendar.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eventId;
	private int ownerId;
	private String title;
	private LocalDateTime starting;
	private LocalDateTime ending;
	private boolean allDay;
	private String address;
	private String description;
		
	@Enumerated(EnumType.STRING)
	private RepeatingOptions repeatingOptions;
	
	private boolean deleted;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	//@OneToMany(mappedBy = "eventId", fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@OneToMany(mappedBy = "eventId", cascade = { CascadeType.ALL })
	private List<Notification> notifications;
	
	
	
	public void addNotification(Notification notification) {
		
		if (notifications == null) {
			notifications = new ArrayList<Notification>();
		}
		
		notifications.add(notification);
	}
	
//	@ManyToMany(mappedBy = "events")
//	private List<User> guests;
	
//	@JsonIgnore
//	private List<Integer> guests;
//	@JsonIgnore
//	private List<Integer> notifications;
}
