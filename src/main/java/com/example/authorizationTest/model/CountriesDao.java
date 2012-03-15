package com.example.authorizationTest.model;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class CountriesDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }

    public List<Countries> getAll()
    {
    	HibernateCallback callback = new HibernateCallback() {
    		public Object doInHibernate(Session session) throws HibernateException, SQLException{
    			Query q = session.createQuery("from countries");
    			return q;
    		}
		};
		return (List<Countries>)hibernateTemplate.execute(callback);
		
    }
    
    public Countries getCountry(final String id){        
        HibernateCallback callback = new HibernateCallback() {
            public Object doInHibernate(Session session) 
                throws HibernateException,SQLException {
                return session.get(Countries.class, id);
            }
        };        
        return (Countries)hibernateTemplate.execute(callback);
    }


    public void saveOrUpdate(final Countries c){
        HibernateCallback callback = new HibernateCallback() {
            public Object doInHibernate(Session session) 
                throws HibernateException,SQLException {
                session.saveOrUpdate(c);
                return null;
            }
        };          
        hibernateTemplate.execute(callback);
    }
}