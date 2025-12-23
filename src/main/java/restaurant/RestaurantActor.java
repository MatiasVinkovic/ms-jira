package restaurant;

import com.saf.core.*;
import com.saf.messages.*; // Assure-toi d'avoir tes classes de messages ici
import org.springframework.stereotype.Component;

@Component
public class RestaurantActor implements Actor {
    @Override
    public void onReceive(Message msg, ActorContext ctx) throws Exception {
        if (msg instanceof OrderRequest req) {
            System.out.println("[RESTO] Commande reçue : " + req.getDishName() + " pour " + ctx.getSender().getName());

            //et on répond au client
            ctx.reply(new OrderResponse("Votre commande pour " + req.getDishName() + " est en cours de préparation."));
        }
    }
}