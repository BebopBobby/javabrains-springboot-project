package topic;

import org.springframework.data.repository.CrudRepository;
import topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
