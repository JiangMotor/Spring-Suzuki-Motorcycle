package com.example.jiangsuzuki.model.paymentsuzuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PaymentsuzukiService { 
    @Autowired 
    PaymentsuzukiRest paymentsuzuki;

    public Iterable<Paymentsuzuki> findAll(){
        return paymentsuzuki.findAll();
    }

    public boolean addPaymentsuzuki(Paymentsuzuki from){
        try{
            Paymentsuzuki y = new Paymentsuzuki();
            y.setSuzuki_id(from.getSuzuki_id());
            y.setPayment_suzuki(from.getPayment_suzuki());

            System.out.println(y);
            paymentsuzuki.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePaymentsuzuki(Paymentsuzuki from){
        try{
           var y = paymentsuzuki.findById(from.getId()).get();
           y.setSuzuki_id(from.getSuzuki_id());
           y.setPayment_suzuki(from.getPayment_suzuki());
   
            paymentsuzuki.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPaymentsuzuki(int id){
           try{
            paymentsuzuki.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}