package star.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import star.tacocloud.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
