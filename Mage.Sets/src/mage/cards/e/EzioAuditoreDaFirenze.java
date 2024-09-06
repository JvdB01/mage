package mage.cards.e;

import mage.MageInt;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.continuous.GainAbilityControlledSpellsEffect;
import mage.abilities.keyword.FreerunningAbility;
import mage.filter.common.FilterNonlandCard;
import mage.abilities.common.DealsCombatDamageToAPlayerTriggeredAbility;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.LoseGameTargetPlayerEffect;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.condition.Condition;
import mage.game.Game;
import mage.abilities.Ability;
import mage.players.Player;

import java.util.UUID;

/**
 *
 * @author JvdB01
 */
public final class EzioAuditoreDaFirenze extends CardImpl {

    private static final FilterNonlandCard filter = new FilterNonlandCard("Assassin spells you cast");

    public EzioAuditoreDaFirenze(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");
        
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ASSASSIN);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        // Menace
        this.addAbility(new MenaceAbility());

        // Assassin spells you cast have freerunning {B}{B}.
        this.addAbility(new SimpleStaticAbility(new GainAbilityControlledSpellsEffect(new FreerunningAbility("{B}{B}"), filter).setText("Assassin spells you cast have freerunning {B}{B}")));
        // Whenever Ezio deals combat damage to a player, you may pay {W}{U}{B}{R}{G} if that player has 10 or less life. When you do, that player loses the game.
        this.addAbility(new DealsCombatDamageToAPlayerTriggeredAbility(
                        new DoIfCostPaid(
                            new ConditionalOneShotEffect(
                                new LoseGameTargetPlayerEffect(),
                                EzioAuditoreDaFirenzeCondition.instance, "that player loses the game"
                            ),new ManaCostsImpl<>("{W}{U}{B}{R}{G}")
                        )
                    )
        );
    }

    private EzioAuditoreDaFirenze(final EzioAuditoreDaFirenze card) {
        super(card);
    }

    @Override
    public EzioAuditoreDaFirenze copy() {
        return new EzioAuditoreDaFirenze(this);
    }
}

enum EzioAuditoreDaFirenzeCondition implements Condition {
    instance;

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(getTargetPointer().getFirst(game, source));
        if (player == null) {
            return false;
        }
        if  (mapToInt(Player::getlife) <= 10){
            return true;
        }
        else {
            return false;
        }
    }
}
