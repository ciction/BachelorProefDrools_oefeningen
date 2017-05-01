package com.sample;




import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.sample.Person;
import com.sample.House;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Message message = new Message();
            
            House house  = new House("Silvereta", "Lakensestraat", 114);
            House house2  = new House("silvereta", "Lakensestraat", 114);
            
            Person personRaf = new Person("Raf", 25);
            Person personChristophe = new Person("Christophe", 26);
            
            personRaf.setHouse(house);
            personChristophe.setHouse(house);
            house.addPerson(personChristophe);
            house.addPerson(personRaf);
            
            
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            
            kSession.insert(message);
            kSession.insert(house);
            kSession.insert(house2);
            
            kSession.insert(personRaf);
            kSession.insert(personChristophe);

            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    
    
    
    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}


