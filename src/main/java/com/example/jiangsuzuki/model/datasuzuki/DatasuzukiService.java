package com.example.jiangsuzuki.model.datasuzuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class DatasuzukiService { 
    @Autowired 
    DatasuzukiRest datasuzuki;

    public Iterable<Datasuzuki> findAll(){
        return datasuzuki.findAll();
    }

    public boolean addDatasuzuki(Datasuzuki from){
        try{
            Datasuzuki y = new Datasuzuki();
            y.setSuzuki_id(from.getSuzuki_id());
            y.setData_suzuki(from.getData_suzuki());
            y.setImage(from.getImage());
            y.setDetail(from.getDetail());
            

            System.out.println(y);
            datasuzuki.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateDatasuzuki(Datasuzuki from){
        try{
           var y = datasuzuki.findById(from.getId()).get();
           y.setSuzuki_id(from.getSuzuki_id());
            y.setData_suzuki(from.getData_suzuki());
            y.setImage(from.getImage());
            y.setDetail(from.getDetail());

           datasuzuki.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delDatasuzuki(int id){
           try{
            datasuzuki.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}