package com.example.jiangsuzuki.model.productsuzuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class ProductsuzukiService { 
    @Autowired 
    ProductsuzukiRest productsuzuki;

    public Iterable<Productsuzuki> findAll(){
        return productsuzuki.findAll();
    }

    public boolean addProductsuzuki(Productsuzuki from){
        try{
            Productsuzuki y = new Productsuzuki();
            y.setSuzuki_id(from.getSuzuki_id());
            y.setProduct_suzuki(from.getProduct_suzuki());

            System.out.println(y);
            productsuzuki.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateProductsuzuki(Productsuzuki from){
        try{
           var y = productsuzuki.findById(from.getId()).get();
            y.setSuzuki_id(from.getSuzuki_id());
            y.setProduct_suzuki(from.getProduct_suzuki());
           
            productsuzuki.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delProductsuzuki(int id){
           try{
            productsuzuki.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}