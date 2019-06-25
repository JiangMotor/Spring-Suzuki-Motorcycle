package com.example.jiangsuzuki.model.suzuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class SuzukiService { 
    @Autowired 
    SuzukiRest suzuki;

    public Iterable<Suzuki> findAll(){
        return suzuki.findAll();
    }

    public boolean addSuzuki(Suzuki from){
        try{
            Suzuki y = new Suzuki();
            y.setImg_suzuki(from.getImg_suzuki());
            y.setName_suzuki(from.getName_suzuki());
            y.setVideo_suzuki(from.getVideo_suzuki());

            System.out.println(y);
            suzuki.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateSuzuki(Suzuki from){
        try{
           var y = suzuki.findById(from.getId()).get();
           y.setImg_suzuki(from.getImg_suzuki());
            y.setName_suzuki(from.getName_suzuki());
            y.setVideo_suzuki(from.getVideo_suzuki());
   
            suzuki.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delSuzuki(int id){
           try{
            suzuki.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}