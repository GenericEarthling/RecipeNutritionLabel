/*
See chap 13 email example
 */
package data;


//import business.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class UserDB {
    
//    public static void insert(User user) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        EntityTransaction trans = em.getTransaction();
//        trans.begin();
//        try {
//            em.persist(user);
//            trans.commit();
//        } catch (Exception e) {
//            System.out.println("Insert user into database error: " + e);
//            trans.rollback();
//        }
//    }
//
//    public static void update(User user) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        EntityTransaction trans = em.getTransaction();
//        trans.begin();
//        try {
//            em.merge(user);
//            trans.commit();
//        } catch (Exception e) {
//            System.out.println("Update user in database error: " + e);
//            trans.rollback();
//        }
//    }
//
//    public static void delete(User user) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        EntityTransaction trans = em.getTransaction();
//        trans.begin();
//        try {
//            em.remove( em.merge(user) );
//            trans.commit();
//        } catch (Exception e) {
//            System.out.println("Delete user from database error: " + e);
//            trans.rollback();
//        }
//    }
//
//    public static User selectUser(String email) {
//        EntityManager em = DBUtil.getEmFactory().createEntityManager();
//        String query = "SELECT u FROM User u WHERE u.email = :email";
//        TypedQuery<User> q = em.createQuery(query, User.class);
//        q.setParameter("email", email);    // sets user entered email value
//        try {
//            User user = q.getSingleResult();
//            return user;
//        } catch (NoResultException e) {
//            System.out.println("Select user in database error: " + e);
//            return null;
//        } finally {
//            em.close();
//        }
//    }
//
//    public static boolean emailExists(String email) {
//       User user = selectUser(email);
//       return user != null;
//    }
}