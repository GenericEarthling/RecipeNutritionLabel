
package data;

import business.Ingredient;
import business.Recipe;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import business.Ingredient;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class IngredientDB {
    
    public static void insert(Ingredient ingredient) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        EntityTransaction trans = em.getTransaction();
//        trans.begin();
//        try {
//            em.persist(ingredient);
//            trans.commit();
//        } catch (Exception e) {
//            System.out.println(e);
//            trans.rollback();
//        } finally {
//            em.close();
//        }
    }

    public static void update(Ingredient ingredient) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        EntityTransaction trans = em.getTransaction();
//        trans.begin();
//        try {
//            em.merge(ingredient);
//            trans.commit();            
//        } catch (Exception e) {
//            System.out.println(e);
//            trans.rollback();
//        } finally {
//            em.close();
//        }
    }

    public static void delete(Ingredient ingredient) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        EntityTransaction trans = em.getTransaction();
//        trans.begin();
//        try {
//            em.remove(em.merge(ingredient));
//            trans.commit();            
//        } catch (Exception e) {
//            System.out.println(e);
//            trans.rollback();
//        } finally {
//            em.close();
//        }       
    }
    
    // not sure if this should be (Ingredient ingredientName) ??
//    public static Ingredient selectIngredient(String ingredientName) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        String query = "SELECT i FROM Ingredient i WHERE i.ingredientName = :ingredientName" ;
//        TypedQuery<Ingredient> q = em.createQuery(query, Ingredient.class);
//        q.setParameter("ingredientName", ingredientName);
//        Ingredient result = null;
//        try {
//            //public List<X> getResultList()
//            //Execute a SELECT query and return the query results as a typed List.
//            result = q.getSingleResult();
//            
//        } catch (NoResultException e) {
//            return null;
//        } finally {
//            em.close();
//        }
//        return (Ingredient)result;
//    }


}
