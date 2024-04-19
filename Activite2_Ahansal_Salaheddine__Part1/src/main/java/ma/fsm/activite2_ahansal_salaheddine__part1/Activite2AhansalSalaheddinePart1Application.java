package ma.fsm.activite2_ahansal_salaheddine__part1;

import ma.fsm.activite2_ahansal_salaheddine__part1.entities.Product;
import ma.fsm.activite2_ahansal_salaheddine__part1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Activite2AhansalSalaheddinePart1Application implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(Activite2AhansalSalaheddinePart1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null,"Computer 1",4300,3));
        productRepository.save(new Product(null,"Computer 2",4300,3));
        productRepository.save(new Product(null,"Computer 3",4300,3));
        List<Product> products = productRepository.findAll();
        products.forEach(product -> {
            System.out.println(product.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("******************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println("******************");
    }
}
