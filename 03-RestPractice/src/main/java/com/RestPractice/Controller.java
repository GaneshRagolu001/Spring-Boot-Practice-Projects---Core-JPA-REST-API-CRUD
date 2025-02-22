package com.RestPractice;

import com.RestPractice.myapp.RestData;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class Controller {
    Map<String, RestData> alldata = new HashMap<>();

    @GetMapping
    private Collection<RestData> GetData(){
        return alldata.values();
    }

    @PostMapping
    private String PostData(@RequestBody RestData userdetails){
        RestData userobj = new RestData();
        userobj.setUserid(userdetails.getUserid());
        userobj.setName(userdetails.getName());
        userobj.setEmail(userdetails.getEmail());
        alldata.put(userdetails.getUserid(),userobj);
        return "Data Posted Sucessfully";
    }

    @PutMapping(path = "/{userid}")
    private String PutData(@PathVariable String userid,@RequestBody RestData userdetails){
        if(alldata.containsKey((userid))){
            RestData userobj = new RestData();
            userobj.setUserid(userdetails.getUserid());
            userobj.setName(userdetails.getName());
            userobj.setEmail(userdetails.getEmail());
            alldata.put(userdetails.getUserid(),userobj);
            return "data updated successfully";
        }
        else {
            return "userid not found";
        }
    }

    @DeleteMapping(path = "/{userid}")
    private String DeleteData(@PathVariable String userid){
        if(alldata.containsKey(userid)){
            alldata.remove(userid);
            return "data deleted successfully";
        }else{
            return "userid not found";
        }
    }
}
