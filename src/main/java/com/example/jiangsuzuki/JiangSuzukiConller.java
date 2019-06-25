package com.example.jiangsuzuki;

import com.example.jiangsuzuki.model.datasuzuki.Datasuzuki;
import com.example.jiangsuzuki.model.datasuzuki.DatasuzukiService;
import com.example.jiangsuzuki.model.suzuki.Suzuki;
import com.example.jiangsuzuki.model.suzuki.SuzukiService;
import com.example.jiangsuzuki.model.paymentsuzuki.Paymentsuzuki;
import com.example.jiangsuzuki.model.paymentsuzuki.PaymentsuzukiService;
import com.example.jiangsuzuki.model.productsuzuki.Productsuzuki;
import com.example.jiangsuzuki.model.productsuzuki.ProductsuzukiService;
import com.example.jiangsuzuki.model.promotionsuzuki.Promotionsuzuki;
import com.example.jiangsuzuki.model.promotionsuzuki.PromotionsuzukiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JiangSuzukiConller {

    //Suzuki
    @Autowired
    private SuzukiService suzuki;

    @GetMapping(value = "/Suzuki")
    public Iterable<Suzuki> promotion() {
        return suzuki.findAll();
    }
    @PostMapping(value="/addSuzuki")
    public ResponseEntity<Boolean> addSuzuki(@RequestBody Suzuki model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(suzuki.addSuzuki(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateSuzuki")
    public ResponseEntity<Boolean> updateSuzuki(@RequestBody Suzuki model){
        return new ResponseEntity<Boolean>(suzuki.updateSuzuki(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delSuzuki/{id}")
    public ResponseEntity<Boolean> delSuzuki(@PathVariable int id){
        return new ResponseEntity<Boolean>(suzuki.delSuzuki(id),HttpStatus.OK);
    } 
    
    @Autowired
    private ProductsuzukiService productsuzuki;

    @GetMapping(value = "/Productsuzuki")
    public Iterable<Productsuzuki> productsuzuki() {
        return productsuzuki.findAll();
    }
    @PostMapping(value="/addProductsuzuki")
    public ResponseEntity<Boolean> addProductsuzuki(@RequestBody Productsuzuki model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(productsuzuki.addProductsuzuki(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateProductsuzuki")
    public ResponseEntity<Boolean> updateProductsuzuki(@RequestBody Productsuzuki model){
        return new ResponseEntity<Boolean>(productsuzuki.updateProductsuzuki(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delProductsuzuki/{id}")
    public ResponseEntity<Boolean> delProductsuzuki(@PathVariable int id){
        return new ResponseEntity<Boolean>(productsuzuki.delProductsuzuki(id),HttpStatus.OK);
    } 

    @Autowired
    private PromotionsuzukiService promotionsuzuki;

    @GetMapping(value = "/Promotionsuzuki")
    public Iterable<Promotionsuzuki> promotionsuzuki() {
        return promotionsuzuki.findAll();
    }
    @PostMapping(value="/addPromotionsuzuki")
    public ResponseEntity<Boolean> addPromotionsuzuki(@RequestBody Promotionsuzuki model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(promotionsuzuki.addPromotionsuzuki(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePromotionsuzuki")
    public ResponseEntity<Boolean> updatePromotionsuzuki(@RequestBody Promotionsuzuki model){
        return new ResponseEntity<Boolean>(promotionsuzuki.updatePromotionsuzuki(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPromotionsuzuki/{id}")
    public ResponseEntity<Boolean> delPromotionsuzuki(@PathVariable int id){
        return new ResponseEntity<Boolean>(promotionsuzuki.delPromotionsuzuki(id),HttpStatus.OK);
    } 

    @Autowired
    private PaymentsuzukiService paymentsuzuki;

    @GetMapping(value = "/Paymentsuzuki")
    public Iterable<Paymentsuzuki> paymentsuzuki() {
        return paymentsuzuki.findAll();
    }
    @PostMapping(value="/addPaymentsuzuki")
    public ResponseEntity<Boolean> addPaymentsuzuki(@RequestBody Paymentsuzuki model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(paymentsuzuki.addPaymentsuzuki(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePaymentsuzuki")
    public ResponseEntity<Boolean> updatePaymentsuzuki(@RequestBody Paymentsuzuki model){
        return new ResponseEntity<Boolean>(paymentsuzuki.updatePaymentsuzuki(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPaymentsuzuki/{id}")
    public ResponseEntity<Boolean> delPaymentsuzuki(@PathVariable int id){
        return new ResponseEntity<Boolean>(paymentsuzuki.delPaymentsuzuki(id),HttpStatus.OK);
    } 

    @Autowired
    private DatasuzukiService datasuzuki;

    @GetMapping(value = "/Datasuzuki")
    public Iterable<Datasuzuki> datasuzuki() {
        return datasuzuki.findAll();
    }
    @PostMapping(value="/addDatasuzuki")
    public ResponseEntity<Boolean> addDatasuzuki(@RequestBody Datasuzuki model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(datasuzuki.addDatasuzuki(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateDatasuzuki")
    public ResponseEntity<Boolean> updateDatasuzuki(@RequestBody Datasuzuki model){
        return new ResponseEntity<Boolean>(datasuzuki.updateDatasuzuki(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delDatasuzuki/{id}")
    public ResponseEntity<Boolean> delDatasuzuki(@PathVariable int id){
        return new ResponseEntity<Boolean>(datasuzuki.delDatasuzuki(id),HttpStatus.OK);
    } 



}
