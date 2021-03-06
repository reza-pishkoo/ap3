package logicController.actions;

import cards.Card;
import cards.Minion;
import logicController.LogicController;
import logicController.LogicRequest;
import logicController.endTurn;
import model.PlayerModel;

public class Doomsayer extends MinionObserver{


    public Doomsayer(PlayerModel player, Minion card) {
        super(player, card);
    }

    @Override
    public void observeBeforeRequest(LogicRequest request, LogicController logicController) throws Exception {
        super.observeBeforeRequest(request, logicController);
    }

    @Override
    public void observeAfterRequest(LogicRequest request, LogicController logicController) {
        super.observeAfterRequest(request, logicController);
        if(request instanceof endTurn) {
            if (getPlayer() == logicController.getGameModel().getCurrentPlayer()) {
                for(Card minion : logicController.getGameModel().getCurrentPlayer().getHandCards()){
                    if(minion != getCard())
                        ((Minion)minion).setHP(0);
                }
                for(Card minion : logicController.getGameModel().getNextPlayer().getHandCards()){
                    if(minion != getCard())
                        ((Minion)minion).setHP(0);
                }
            }
        }
    }
}
