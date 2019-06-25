package com.example.jiangsuzuki.model.promotionsuzuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PromotionsuzukiService { 
    @Autowired 
    PromotionsuzukiRest promotionsuzuki;

    public Iterable<Promotionsuzuki> findAll(){
        return promotionsuzuki.findAll();
    }

    public boolean addPromotionsuzuki(Promotionsuzuki from){
        try{
            Promotionsuzuki y = new Promotionsuzuki();
            y.setSuzuki_id(from.getSuzuki_id());
            y.setPromotion_suzuki(from.getPromotion_suzuki());
            y.setDetail(from.getDetail());

            System.out.println(y);
            promotionsuzuki.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePromotionsuzuki(Promotionsuzuki from){
        try{
           var y = promotionsuzuki.findById(from.getId()).get();
           y.setSuzuki_id(from.getSuzuki_id());
            y.setPromotion_suzuki(from.getPromotion_suzuki());
            y.setDetail(from.getDetail());
           
            promotionsuzuki.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPromotionsuzuki(int id){
           try{
            promotionsuzuki.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}