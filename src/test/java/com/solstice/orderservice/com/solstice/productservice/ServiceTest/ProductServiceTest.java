// package com.solstice.orderservice.com.solstice.productservice.ServiceTest;

// import com.solstice.orderservice.com.solstice.productservice.Domain.Product;
// import com.solstice.orderservice.com.solstice.productservice.Repository.ProductRepository;
// import org.junit.Assert;
// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.mockito.junit.MockitoJUnitRunner;
// import org.springframework.boot.test.context.SpringBootTest;

// import java.util.Arrays;
// import java.util.List;

// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.Mockito.when;
// @RunWith(MockitoJUnitRunner.class)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
// public class ProductServiceTest {
//     @Mock
//     private ProductRepository productRepository;

//     @Before
//     public void setUp(){
//         MockitoAnnotations.initMocks(this);
//     }

//     @Test
//     public void testGetAllproducts(){
//         Product product1=new Product(1,"Apple","fruit","apple-url",20);
//         Product product2=new Product(2,"Orange","fruit","orange-url",10);
//         Product product3=new Product(3,"Mango","fruit","mango-url",30);
//         List<Product> productList= Arrays.asList(product1,product2,product3);
//         when(productRepository.findAll()).thenReturn(productList);
//         List<Product> productList1=productRepository.findAll();
//         Assert.assertEquals(productList,productList1);
//     }

//     @Test
//     public void testAddNewProducts(){
//         Product product1=new Product(1,"Apple","fruit","apple-url",20);
//         when(productRepository.save(any(Product.class))).thenReturn(product1);
//         Product product=productRepository.save(product1);
//         Assert.assertEquals(product1,product);
//     }



// }
