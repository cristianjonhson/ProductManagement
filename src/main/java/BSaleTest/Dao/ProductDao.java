package BSaleTest.Dao;

import BSaleTest.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {


}
