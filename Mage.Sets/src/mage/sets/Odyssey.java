/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author North
 */
public class Odyssey extends ExpansionSet {
    private static final Odyssey instance = new Odyssey();

    public static Odyssey getInstance() {
        return instance;
    }

    private Odyssey() {
        super("Odyssey", "ODY", ExpansionSet.buildDate(2001, 9, 22), SetType.EXPANSION);
        this.blockName = "Odyssey";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abandoned Outpost", 312, Rarity.COMMON, mage.cards.a.AbandonedOutpost.class));
        cards.add(new SetCardInfo("Aboshan, Cephalid Emperor", 58, Rarity.RARE, mage.cards.a.AboshanCephalidEmperor.class));
        cards.add(new SetCardInfo("Aboshan's Desire", 59, Rarity.COMMON, mage.cards.a.AboshansDesire.class));
        cards.add(new SetCardInfo("Acceptable Losses", 172, Rarity.COMMON, mage.cards.a.AcceptableLosses.class));
        cards.add(new SetCardInfo("Aegis of Honor", 1, Rarity.RARE, mage.cards.a.AegisOfHonor.class));
        cards.add(new SetCardInfo("Aether Burst", 60, Rarity.COMMON, mage.cards.a.AetherBurst.class));
        cards.add(new SetCardInfo("Afflict", 115, Rarity.COMMON, mage.cards.a.Afflict.class));
        cards.add(new SetCardInfo("Amugaba", 61, Rarity.RARE, mage.cards.a.Amugaba.class));
        cards.add(new SetCardInfo("Anarchist", 173, Rarity.COMMON, mage.cards.a.Anarchist.class));
        cards.add(new SetCardInfo("Ancestral Tribute", 2, Rarity.RARE, mage.cards.a.AncestralTribute.class));
        cards.add(new SetCardInfo("Angelic Wall", 3, Rarity.COMMON, mage.cards.a.AngelicWall.class));
        cards.add(new SetCardInfo("Animal Boneyard", 4, Rarity.UNCOMMON, mage.cards.a.AnimalBoneyard.class));
        cards.add(new SetCardInfo("Ashen Firebeast", 174, Rarity.RARE, mage.cards.a.AshenFirebeast.class));
        cards.add(new SetCardInfo("Atogatog", 286, Rarity.RARE, mage.cards.a.Atogatog.class));
        cards.add(new SetCardInfo("Aura Graft", 62, Rarity.UNCOMMON, mage.cards.a.AuraGraft.class));
        cards.add(new SetCardInfo("Auramancer", 5, Rarity.COMMON, mage.cards.a.Auramancer.class));
        cards.add(new SetCardInfo("Aven Archer", 6, Rarity.UNCOMMON, mage.cards.a.AvenArcher.class));
        cards.add(new SetCardInfo("Aven Cloudchaser", 7, Rarity.COMMON, mage.cards.a.AvenCloudchaser.class));
        cards.add(new SetCardInfo("Aven Fisher", 63, Rarity.COMMON, mage.cards.a.AvenFisher.class));
        cards.add(new SetCardInfo("Aven Flock", 8, Rarity.COMMON, mage.cards.a.AvenFlock.class));
        cards.add(new SetCardInfo("Aven Smokeweaver", 64, Rarity.UNCOMMON, mage.cards.a.AvenSmokeweaver.class));
        cards.add(new SetCardInfo("Aven Windreader", 65, Rarity.COMMON, mage.cards.a.AvenWindreader.class));
        cards.add(new SetCardInfo("Balancing Act", 10, Rarity.RARE, mage.cards.b.BalancingAct.class));
        cards.add(new SetCardInfo("Balshan Beguiler", 66, Rarity.UNCOMMON, mage.cards.b.BalshanBeguiler.class));
        cards.add(new SetCardInfo("Balshan Griffin", 67, Rarity.UNCOMMON, mage.cards.b.BalshanGriffin.class));
        cards.add(new SetCardInfo("Barbarian Lunatic", 175, Rarity.COMMON, mage.cards.b.BarbarianLunatic.class));
        cards.add(new SetCardInfo("Barbarian Ring", 313, Rarity.UNCOMMON, mage.cards.b.BarbarianRing.class));
        cards.add(new SetCardInfo("Bash to Bits", 176, Rarity.UNCOMMON, mage.cards.b.BashToBits.class));
        cards.add(new SetCardInfo("Battle of Wits", 69, Rarity.RARE, mage.cards.b.BattleOfWits.class));
        cards.add(new SetCardInfo("Battle Strain", 177, Rarity.UNCOMMON, mage.cards.b.BattleStrain.class));
        cards.add(new SetCardInfo("Bearscape", 229, Rarity.RARE, mage.cards.b.Bearscape.class));
        cards.add(new SetCardInfo("Beast Attack", 230, Rarity.UNCOMMON, mage.cards.b.BeastAttack.class));
        cards.add(new SetCardInfo("Beloved Chaplain", 11, Rarity.UNCOMMON, mage.cards.b.BelovedChaplain.class));
        cards.add(new SetCardInfo("Blazing Salvo", 178, Rarity.COMMON, mage.cards.b.BlazingSalvo.class));
        cards.add(new SetCardInfo("Blessed Orator", 12, Rarity.UNCOMMON, mage.cards.b.BlessedOrator.class));
        cards.add(new SetCardInfo("Bloodcurdler", 116, Rarity.RARE, mage.cards.b.Bloodcurdler.class));
        cards.add(new SetCardInfo("Bog Wreckage", 314, Rarity.COMMON, mage.cards.b.BogWreckage.class));
        cards.add(new SetCardInfo("Bomb Squad", 179, Rarity.RARE, mage.cards.b.BombSquad.class));
        cards.add(new SetCardInfo("Braids, Cabal Minion", 117, Rarity.RARE, mage.cards.b.BraidsCabalMinion.class));
        cards.add(new SetCardInfo("Buried Alive", 118, Rarity.UNCOMMON, mage.cards.b.BuriedAlive.class));
        cards.add(new SetCardInfo("Burning Sands", 180, Rarity.RARE, mage.cards.b.BurningSands.class));
        cards.add(new SetCardInfo("Cabal Inquisitor", 119, Rarity.COMMON, mage.cards.c.CabalInquisitor.class));
        cards.add(new SetCardInfo("Cabal Patriarch", 120, Rarity.RARE, mage.cards.c.CabalPatriarch.class));
        cards.add(new SetCardInfo("Cabal Pit", 315, Rarity.UNCOMMON, mage.cards.c.CabalPit.class));
        cards.add(new SetCardInfo("Call of the Herd", 231, Rarity.RARE, mage.cards.c.CallOfTheHerd.class));
        cards.add(new SetCardInfo("Cantivore", 13, Rarity.RARE, mage.cards.c.Cantivore.class));
        cards.add(new SetCardInfo("Careful Study", 70, Rarity.COMMON, mage.cards.c.CarefulStudy.class));
        cards.add(new SetCardInfo("Cartographer", 232, Rarity.COMMON, mage.cards.c.Cartographer.class));
        cards.add(new SetCardInfo("Caustic Tar", 122, Rarity.UNCOMMON, mage.cards.c.CausticTar.class));
        cards.add(new SetCardInfo("Cease-Fire", 14, Rarity.COMMON, mage.cards.c.CeaseFire.class));
        cards.add(new SetCardInfo("Centaur Garden", 316, Rarity.UNCOMMON, mage.cards.c.CentaurGarden.class));
        cards.add(new SetCardInfo("Cephalid Broker", 71, Rarity.UNCOMMON, mage.cards.c.CephalidBroker.class));
        cards.add(new SetCardInfo("Cephalid Coliseum", 317, Rarity.UNCOMMON, mage.cards.c.CephalidColiseum.class));
        cards.add(new SetCardInfo("Cephalid Looter", 72, Rarity.COMMON, mage.cards.c.CephalidLooter.class));
        cards.add(new SetCardInfo("Cephalid Retainer", 73, Rarity.RARE, mage.cards.c.CephalidRetainer.class));
        cards.add(new SetCardInfo("Cephalid Scout", 74, Rarity.COMMON, mage.cards.c.CephalidScout.class));
        cards.add(new SetCardInfo("Chainflinger", 181, Rarity.COMMON, mage.cards.c.Chainflinger.class));
        cards.add(new SetCardInfo("Chamber of Manipulation", 76, Rarity.UNCOMMON, mage.cards.c.ChamberOfManipulation.class));
        cards.add(new SetCardInfo("Chance Encounter", 182, Rarity.RARE, mage.cards.c.ChanceEncounter.class));
        cards.add(new SetCardInfo("Chatter of the Squirrel", 233, Rarity.COMMON, mage.cards.c.ChatterOfTheSquirrel.class));
        cards.add(new SetCardInfo("Childhood Horror", 123, Rarity.UNCOMMON, mage.cards.c.ChildhoodHorror.class));
        cards.add(new SetCardInfo("Chlorophant", 234, Rarity.RARE, mage.cards.c.Chlorophant.class));
        cards.add(new SetCardInfo("Coffin Purge", 124, Rarity.COMMON, mage.cards.c.CoffinPurge.class));
        cards.add(new SetCardInfo("Cognivore", 77, Rarity.RARE, mage.cards.c.Cognivore.class));
        cards.add(new SetCardInfo("Concentrate", 78, Rarity.UNCOMMON, mage.cards.c.Concentrate.class));
        cards.add(new SetCardInfo("Confessor", 15, Rarity.COMMON, mage.cards.c.Confessor.class));
        cards.add(new SetCardInfo("Crashing Centaur", 235, Rarity.UNCOMMON, mage.cards.c.CrashingCentaur.class));
        cards.add(new SetCardInfo("Crypt Creeper", 125, Rarity.COMMON, mage.cards.c.CryptCreeper.class));
        cards.add(new SetCardInfo("Crystal Quarry", 318, Rarity.RARE, mage.cards.c.CrystalQuarry.class));
        cards.add(new SetCardInfo("Cultural Exchange", 79, Rarity.RARE, mage.cards.c.CulturalExchange.class));
        cards.add(new SetCardInfo("Cursed Monstrosity", 126, Rarity.RARE, mage.cards.c.CursedMonstrosity.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 319, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Darkwater Egg", 299, Rarity.UNCOMMON, mage.cards.d.DarkwaterEgg.class));
        cards.add(new SetCardInfo("Decaying Soil", 127, Rarity.RARE, mage.cards.d.DecayingSoil.class));
        cards.add(new SetCardInfo("Decimate", 287, Rarity.RARE, mage.cards.d.Decimate.class));
        cards.add(new SetCardInfo("Decompose", 128, Rarity.UNCOMMON, mage.cards.d.Decompose.class));
        cards.add(new SetCardInfo("Dedicated Martyr", 16, Rarity.COMMON, mage.cards.d.DedicatedMartyr.class));
        cards.add(new SetCardInfo("Deep Reconnaissance", 236, Rarity.UNCOMMON, mage.cards.d.DeepReconnaissance.class));
        cards.add(new SetCardInfo("Delaying Shield", 17, Rarity.RARE, mage.cards.d.DelayingShield.class));
        cards.add(new SetCardInfo("Deluge", 80, Rarity.UNCOMMON, mage.cards.d.Deluge.class));
        cards.add(new SetCardInfo("Dematerialize", 81, Rarity.COMMON, mage.cards.d.Dematerialize.class));
        cards.add(new SetCardInfo("Demolish", 183, Rarity.UNCOMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Demoralize", 184, Rarity.COMMON, mage.cards.d.Demoralize.class));
        cards.add(new SetCardInfo("Deserted Temple", 320, Rarity.RARE, mage.cards.d.DesertedTemple.class));
        cards.add(new SetCardInfo("Devoted Caretaker", 18, Rarity.RARE, mage.cards.d.DevotedCaretaker.class));
        cards.add(new SetCardInfo("Diabolic Tutor", 129, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Diligent Farmhand", 237, Rarity.COMMON, mage.cards.d.DiligentFarmhand.class));
        cards.add(new SetCardInfo("Dirty Wererat", 130, Rarity.COMMON, mage.cards.d.DirtyWererat.class));
        cards.add(new SetCardInfo("Divert", 82, Rarity.RARE, mage.cards.d.Divert.class));
        cards.add(new SetCardInfo("Divine Sacrament", 19, Rarity.RARE, mage.cards.d.DivineSacrament.class));
        cards.add(new SetCardInfo("Dogged Hunter", 20, Rarity.RARE, mage.cards.d.DoggedHunter.class));
        cards.add(new SetCardInfo("Dreamwinder", 83, Rarity.COMMON, mage.cards.d.Dreamwinder.class));
        cards.add(new SetCardInfo("Druid Lyrist", 238, Rarity.COMMON, mage.cards.d.DruidLyrist.class));
        cards.add(new SetCardInfo("Druid's Call", 239, Rarity.UNCOMMON, mage.cards.d.DruidsCall.class));
        cards.add(new SetCardInfo("Dusk Imp", 131, Rarity.COMMON, mage.cards.d.DuskImp.class));
        cards.add(new SetCardInfo("Dwarven Grunt", 185, Rarity.COMMON, mage.cards.d.DwarvenGrunt.class));
        cards.add(new SetCardInfo("Dwarven Recruiter", 186, Rarity.UNCOMMON, mage.cards.d.DwarvenRecruiter.class));
        cards.add(new SetCardInfo("Dwarven Strike Force", 188, Rarity.UNCOMMON, mage.cards.d.DwarvenStrikeForce.class));
        cards.add(new SetCardInfo("Earnest Fellowship", 21, Rarity.RARE, mage.cards.e.EarnestFellowship.class));
        cards.add(new SetCardInfo("Earth Rift", 189, Rarity.COMMON, mage.cards.e.EarthRift.class));
        cards.add(new SetCardInfo("Elephant Ambush", 240, Rarity.COMMON, mage.cards.e.ElephantAmbush.class));
        cards.add(new SetCardInfo("Ember Beast", 190, Rarity.COMMON, mage.cards.e.EmberBeast.class));
        cards.add(new SetCardInfo("Engulfing Flames", 191, Rarity.UNCOMMON, mage.cards.e.EngulfingFlames.class));
        cards.add(new SetCardInfo("Entomb", 132, Rarity.RARE, mage.cards.e.Entomb.class));
        cards.add(new SetCardInfo("Epicenter", 192, Rarity.RARE, mage.cards.e.Epicenter.class));
        cards.add(new SetCardInfo("Escape Artist", 84, Rarity.COMMON, mage.cards.e.EscapeArtist.class));
        cards.add(new SetCardInfo("Execute", 133, Rarity.UNCOMMON, mage.cards.e.Execute.class));
        cards.add(new SetCardInfo("Extract", 85, Rarity.RARE, mage.cards.e.Extract.class));
        cards.add(new SetCardInfo("Face of Fear", 134, Rarity.UNCOMMON, mage.cards.f.FaceOfFear.class));
        cards.add(new SetCardInfo("Famished Ghoul", 135, Rarity.UNCOMMON, mage.cards.f.FamishedGhoul.class));
        cards.add(new SetCardInfo("Fervent Denial", 86, Rarity.UNCOMMON, mage.cards.f.FerventDenial.class));
        cards.add(new SetCardInfo("Filthy Cur", 136, Rarity.COMMON, mage.cards.f.FilthyCur.class));
        cards.add(new SetCardInfo("Firebolt", 193, Rarity.COMMON, mage.cards.f.Firebolt.class));
        cards.add(new SetCardInfo("Flame Burst", 194, Rarity.COMMON, mage.cards.f.FlameBurst.class));
        cards.add(new SetCardInfo("Fledgling Imp", 137, Rarity.COMMON, mage.cards.f.FledglingImp.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frenetic Ogre", 195, Rarity.UNCOMMON, mage.cards.f.FreneticOgre.class));
        cards.add(new SetCardInfo("Frightcrawler", 138, Rarity.COMMON, mage.cards.f.Frightcrawler.class));
        cards.add(new SetCardInfo("Gallantry", 23, Rarity.UNCOMMON, mage.cards.g.Gallantry.class));
        cards.add(new SetCardInfo("Ghastly Demise", 139, Rarity.COMMON, mage.cards.g.GhastlyDemise.class));
        cards.add(new SetCardInfo("Gorilla Titan", 241, Rarity.UNCOMMON, mage.cards.g.GorillaTitan.class));
        cards.add(new SetCardInfo("Graceful Antelope", 24, Rarity.RARE, mage.cards.g.GracefulAntelope.class));
        cards.add(new SetCardInfo("Gravedigger", 140, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Gravestorm", 141, Rarity.RARE, mage.cards.g.Gravestorm.class));
        cards.add(new SetCardInfo("Ground Seal", 242, Rarity.RARE, mage.cards.g.GroundSeal.class));
        cards.add(new SetCardInfo("Halberdier", 196, Rarity.COMMON, mage.cards.h.Halberdier.class));
        cards.add(new SetCardInfo("Hallowed Healer", 25, Rarity.COMMON, mage.cards.h.HallowedHealer.class));
        cards.add(new SetCardInfo("Haunting Echoes", 142, Rarity.RARE, mage.cards.h.HauntingEchoes.class));
        cards.add(new SetCardInfo("Howling Gale", 244, Rarity.UNCOMMON, mage.cards.h.HowlingGale.class));
        cards.add(new SetCardInfo("Immobilizing Ink", 87, Rarity.COMMON, mage.cards.i.ImmobilizingInk.class));
        cards.add(new SetCardInfo("Infected Vermin", 144, Rarity.UNCOMMON, mage.cards.i.InfectedVermin.class));
        cards.add(new SetCardInfo("Innocent Blood", 145, Rarity.COMMON, mage.cards.i.InnocentBlood.class));
        cards.add(new SetCardInfo("Iridescent Angel", 288, Rarity.RARE, mage.cards.i.IridescentAngel.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivy Elemental", 245, Rarity.RARE, mage.cards.i.IvyElemental.class));
        cards.add(new SetCardInfo("Kamahl, Pit Fighter", 198, Rarity.RARE, mage.cards.k.KamahlPitFighter.class));
        cards.add(new SetCardInfo("Kamahl's Desire", 199, Rarity.COMMON, mage.cards.k.KamahlsDesire.class));
        cards.add(new SetCardInfo("Karmic Justice", 26, Rarity.RARE, mage.cards.k.KarmicJustice.class));
        cards.add(new SetCardInfo("Kirtar's Desire", 27, Rarity.COMMON, mage.cards.k.KirtarsDesire.class));
        cards.add(new SetCardInfo("Kirtar's Wrath", 28, Rarity.RARE, mage.cards.k.KirtarsWrath.class));
        cards.add(new SetCardInfo("Krosan Archer", 246, Rarity.COMMON, mage.cards.k.KrosanArcher.class));
        cards.add(new SetCardInfo("Krosan Avenger", 247, Rarity.COMMON, mage.cards.k.KrosanAvenger.class));
        cards.add(new SetCardInfo("Krosan Beast", 248, Rarity.RARE, mage.cards.k.KrosanBeast.class));
        cards.add(new SetCardInfo("Laquatus's Creativity", 88, Rarity.UNCOMMON, mage.cards.l.LaquatussCreativity.class));
        cards.add(new SetCardInfo("Lava Blister", 200, Rarity.UNCOMMON, mage.cards.l.LavaBlister.class));
        cards.add(new SetCardInfo("Leaf Dancer", 249, Rarity.COMMON, mage.cards.l.LeafDancer.class));
        cards.add(new SetCardInfo("Lieutenant Kirtar", 29, Rarity.RARE, mage.cards.l.LieutenantKirtar.class));
        cards.add(new SetCardInfo("Life Burst", 30, Rarity.COMMON, mage.cards.l.LifeBurst.class));
        cards.add(new SetCardInfo("Liquid Fire", 201, Rarity.UNCOMMON, mage.cards.l.LiquidFire.class));
        cards.add(new SetCardInfo("Lithatog", 289, Rarity.UNCOMMON, mage.cards.l.Lithatog.class));
        cards.add(new SetCardInfo("Luminous Guardian", 31, Rarity.UNCOMMON, mage.cards.l.LuminousGuardian.class));
        cards.add(new SetCardInfo("Magma Vein", 203, Rarity.UNCOMMON, mage.cards.m.MagmaVein.class));
        cards.add(new SetCardInfo("Magnivore", 204, Rarity.RARE, mage.cards.m.Magnivore.class));
        cards.add(new SetCardInfo("Malevolent Awakening", 147, Rarity.UNCOMMON, mage.cards.m.MalevolentAwakening.class));
        cards.add(new SetCardInfo("Master Apothecary", 32, Rarity.RARE, mage.cards.m.MasterApothecary.class));
        cards.add(new SetCardInfo("Metamorphic Wurm", 250, Rarity.UNCOMMON, mage.cards.m.MetamorphicWurm.class));
        cards.add(new SetCardInfo("Millikin", 302, Rarity.UNCOMMON, mage.cards.m.Millikin.class));
        cards.add(new SetCardInfo("Mindslicer", 149, Rarity.RARE, mage.cards.m.Mindslicer.class));
        cards.add(new SetCardInfo("Mine Layer", 205, Rarity.RARE, mage.cards.m.MineLayer.class));
        cards.add(new SetCardInfo("Minotaur Explorer", 206, Rarity.UNCOMMON, mage.cards.m.MinotaurExplorer.class));
        cards.add(new SetCardInfo("Mirari", 303, Rarity.RARE, mage.cards.m.Mirari.class));
        cards.add(new SetCardInfo("Molten Influence", 207, Rarity.RARE, mage.cards.m.MoltenInfluence.class));
        cards.add(new SetCardInfo("Moment's Peace", 251, Rarity.COMMON, mage.cards.m.MomentsPeace.class));
        cards.add(new SetCardInfo("Morbid Hunger", 150, Rarity.COMMON, mage.cards.m.MorbidHunger.class));
        cards.add(new SetCardInfo("Morgue Theft", 151, Rarity.COMMON, mage.cards.m.MorgueTheft.class));
        cards.add(new SetCardInfo("Mortivore", 152, Rarity.RARE, mage.cards.m.Mortivore.class));
        cards.add(new SetCardInfo("Mossfire Egg", 304, Rarity.UNCOMMON, mage.cards.m.MossfireEgg.class));
        cards.add(new SetCardInfo("Mossfire Valley", 321, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mudhole", 208, Rarity.RARE, mage.cards.m.Mudhole.class));
        cards.add(new SetCardInfo("Muscle Burst", 252, Rarity.COMMON, mage.cards.m.MuscleBurst.class));
        cards.add(new SetCardInfo("Mystic Crusader", 33, Rarity.RARE, mage.cards.m.MysticCrusader.class));
        cards.add(new SetCardInfo("Mystic Enforcer", 290, Rarity.RARE, mage.cards.m.MysticEnforcer.class));
        cards.add(new SetCardInfo("Mystic Penitent", 34, Rarity.UNCOMMON, mage.cards.m.MysticPenitent.class));
        cards.add(new SetCardInfo("Mystic Visionary", 35, Rarity.COMMON, mage.cards.m.MysticVisionary.class));
        cards.add(new SetCardInfo("Mystic Zealot", 36, Rarity.COMMON, mage.cards.m.MysticZealot.class));
        cards.add(new SetCardInfo("Nantuko Disciple", 253, Rarity.COMMON, mage.cards.n.NantukoDisciple.class));
        cards.add(new SetCardInfo("Nantuko Elder", 254, Rarity.UNCOMMON, mage.cards.n.NantukoElder.class));
        cards.add(new SetCardInfo("Nantuko Mentor", 255, Rarity.RARE, mage.cards.n.NantukoMentor.class));
        cards.add(new SetCardInfo("Need for Speed", 209, Rarity.RARE, mage.cards.n.NeedForSpeed.class));
        cards.add(new SetCardInfo("Nefarious Lich", 153, Rarity.RARE, mage.cards.n.NefariousLich.class));
        cards.add(new SetCardInfo("New Frontiers", 257, Rarity.RARE, mage.cards.n.NewFrontiers.class));
        cards.add(new SetCardInfo("Nimble Mongoose", 258, Rarity.UNCOMMON, mage.cards.n.NimbleMongoose.class));
        cards.add(new SetCardInfo("Nomad Decoy", 37, Rarity.UNCOMMON, mage.cards.n.NomadDecoy.class));
        cards.add(new SetCardInfo("Nomad Stadium", 322, Rarity.UNCOMMON, mage.cards.n.NomadStadium.class));
        cards.add(new SetCardInfo("Nut Collector", 259, Rarity.RARE, mage.cards.n.NutCollector.class));
        cards.add(new SetCardInfo("Obstinate Familiar", 210, Rarity.RARE, mage.cards.o.ObstinateFamiliar.class));
        cards.add(new SetCardInfo("Overeager Apprentice", 154, Rarity.COMMON, mage.cards.o.OvereagerApprentice.class));
        cards.add(new SetCardInfo("Overrun", 260, Rarity.UNCOMMON, mage.cards.o.Overrun.class));
        cards.add(new SetCardInfo("Pardic Firecat", 211, Rarity.COMMON, mage.cards.p.PardicFirecat.class));
        cards.add(new SetCardInfo("Pardic Miner", 212, Rarity.RARE, mage.cards.p.PardicMiner.class));
        cards.add(new SetCardInfo("Pardic Swordsmith", 213, Rarity.COMMON, mage.cards.p.PardicSwordsmith.class));
        cards.add(new SetCardInfo("Patchwork Gnomes", 306, Rarity.UNCOMMON, mage.cards.p.PatchworkGnomes.class));
        cards.add(new SetCardInfo("Patriarch's Desire", 156, Rarity.COMMON, mage.cards.p.PatriarchsDesire.class));
        cards.add(new SetCardInfo("Patrol Hound", 38, Rarity.COMMON, mage.cards.p.PatrolHound.class));
        cards.add(new SetCardInfo("Patron Wizard", 89, Rarity.RARE, mage.cards.p.PatronWizard.class));
        cards.add(new SetCardInfo("Peek", 91, Rarity.COMMON, mage.cards.p.Peek.class));
        cards.add(new SetCardInfo("Persuasion", 92, Rarity.RARE, mage.cards.p.Persuasion.class));
        cards.add(new SetCardInfo("Petrified Field", 323, Rarity.RARE, mage.cards.p.PetrifiedField.class));
        cards.add(new SetCardInfo("Phantatog", 291, Rarity.UNCOMMON, mage.cards.p.Phantatog.class));
        cards.add(new SetCardInfo("Pianna, Nomad Captain", 39, Rarity.RARE, mage.cards.p.PiannaNomadCaptain.class));
        cards.add(new SetCardInfo("Pilgrim of Justice", 40, Rarity.COMMON, mage.cards.p.PilgrimOfJustice.class));
        cards.add(new SetCardInfo("Pilgrim of Virtue", 41, Rarity.COMMON, mage.cards.p.PilgrimOfVirtue.class));
        cards.add(new SetCardInfo("Piper's Melody", 261, Rarity.UNCOMMON, mage.cards.p.PipersMelody.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Predict", 94, Rarity.UNCOMMON, mage.cards.p.Predict.class));
        cards.add(new SetCardInfo("Price of Glory", 214, Rarity.UNCOMMON, mage.cards.p.PriceOfGlory.class));
        cards.add(new SetCardInfo("Primal Frenzy", 262, Rarity.COMMON, mage.cards.p.PrimalFrenzy.class));
        cards.add(new SetCardInfo("Psionic Gift", 95, Rarity.COMMON, mage.cards.p.PsionicGift.class));
        cards.add(new SetCardInfo("Psychatog", 292, Rarity.UNCOMMON, mage.cards.p.Psychatog.class));
        cards.add(new SetCardInfo("Pulsating Illusion", 96, Rarity.UNCOMMON, mage.cards.p.PulsatingIllusion.class));
        cards.add(new SetCardInfo("Puppeteer", 97, Rarity.UNCOMMON, mage.cards.p.Puppeteer.class));
        cards.add(new SetCardInfo("Rabid Elephant", 263, Rarity.COMMON, mage.cards.r.RabidElephant.class));
        cards.add(new SetCardInfo("Ravaged Highlands", 324, Rarity.COMMON, mage.cards.r.RavagedHighlands.class));
        cards.add(new SetCardInfo("Ray of Distortion", 42, Rarity.COMMON, mage.cards.r.RayOfDistortion.class));
        cards.add(new SetCardInfo("Reckless Charge", 215, Rarity.COMMON, mage.cards.r.RecklessCharge.class));
        cards.add(new SetCardInfo("Recoup", 216, Rarity.UNCOMMON, mage.cards.r.Recoup.class));
        cards.add(new SetCardInfo("Refresh", 264, Rarity.COMMON, mage.cards.r.Refresh.class));
        cards.add(new SetCardInfo("Repel", 98, Rarity.COMMON, mage.cards.r.Repel.class));
        cards.add(new SetCardInfo("Repentant Vampire", 157, Rarity.RARE, mage.cards.r.RepentantVampire.class));
        cards.add(new SetCardInfo("Resilient Wanderer", 43, Rarity.UNCOMMON, mage.cards.r.ResilientWanderer.class));
        cards.add(new SetCardInfo("Rites of Initiation", 217, Rarity.COMMON, mage.cards.r.RitesOfInitiation.class));
        cards.add(new SetCardInfo("Rites of Refusal", 99, Rarity.COMMON, mage.cards.r.RitesOfRefusal.class));
        cards.add(new SetCardInfo("Roar of the Wurm", 266, Rarity.UNCOMMON, mage.cards.r.RoarOfTheWurm.class));
        cards.add(new SetCardInfo("Rotting Giant", 158, Rarity.UNCOMMON, mage.cards.r.RottingGiant.class));
        cards.add(new SetCardInfo("Sacred Rites", 44, Rarity.COMMON, mage.cards.s.SacredRites.class));
        cards.add(new SetCardInfo("Sadistic Hypnotist", 159, Rarity.UNCOMMON, mage.cards.s.SadisticHypnotist.class));
        cards.add(new SetCardInfo("Sandstone Deadfall", 307, Rarity.UNCOMMON, mage.cards.s.SandstoneDeadfall.class));
        cards.add(new SetCardInfo("Sarcatog", 293, Rarity.UNCOMMON, mage.cards.s.Sarcatog.class));
        cards.add(new SetCardInfo("Savage Firecat", 218, Rarity.RARE, mage.cards.s.SavageFirecat.class));
        cards.add(new SetCardInfo("Scorching Missile", 219, Rarity.COMMON, mage.cards.s.ScorchingMissile.class));
        cards.add(new SetCardInfo("Screams of the Damned", 160, Rarity.UNCOMMON, mage.cards.s.ScreamsOfTheDamned.class));
        cards.add(new SetCardInfo("Scrivener", 100, Rarity.COMMON, mage.cards.s.Scrivener.class));
        cards.add(new SetCardInfo("Seafloor Debris", 325, Rarity.COMMON, mage.cards.s.SeafloorDebris.class));
        cards.add(new SetCardInfo("Second Thoughts", 45, Rarity.COMMON, mage.cards.s.SecondThoughts.class));
        cards.add(new SetCardInfo("Seize the Day", 220, Rarity.RARE, mage.cards.s.SeizeTheDay.class));
        cards.add(new SetCardInfo("Seton, Krosan Protector", 267, Rarity.RARE, mage.cards.s.SetonKrosanProtector.class));
        cards.add(new SetCardInfo("Seton's Desire", 268, Rarity.UNCOMMON, mage.cards.s.SetonsDesire.class));
        cards.add(new SetCardInfo("Shadowblood Egg", 308, Rarity.UNCOMMON, mage.cards.s.ShadowbloodEgg.class));
        cards.add(new SetCardInfo("Shadowblood Ridge", 326, Rarity.RARE, mage.cards.s.ShadowbloodRidge.class));
        cards.add(new SetCardInfo("Shadowmage Infiltrator", 294, Rarity.RARE, mage.cards.s.ShadowmageInfiltrator.class));
        cards.add(new SetCardInfo("Shelter", 46, Rarity.COMMON, mage.cards.s.Shelter.class));
        cards.add(new SetCardInfo("Shifty Doppelganger", 101, Rarity.RARE, mage.cards.s.ShiftyDoppelganger.class));
        cards.add(new SetCardInfo("Shower of Coals", 221, Rarity.UNCOMMON, mage.cards.s.ShowerOfCoals.class));
        cards.add(new SetCardInfo("Simplify", 269, Rarity.COMMON, mage.cards.s.Simplify.class));
        cards.add(new SetCardInfo("Skeletal Scrying", 161, Rarity.UNCOMMON, mage.cards.s.SkeletalScrying.class));
        cards.add(new SetCardInfo("Skull Fracture", 162, Rarity.UNCOMMON, mage.cards.s.SkullFracture.class));
        cards.add(new SetCardInfo("Skycloud Egg", 309, Rarity.UNCOMMON, mage.cards.s.SkycloudEgg.class));
        cards.add(new SetCardInfo("Skycloud Expanse", 327, Rarity.RARE, mage.cards.s.SkycloudExpanse.class));
        cards.add(new SetCardInfo("Skyshooter", 270, Rarity.UNCOMMON, mage.cards.s.Skyshooter.class));
        cards.add(new SetCardInfo("Soulcatcher", 47, Rarity.UNCOMMON, mage.cards.s.Soulcatcher.class));
        cards.add(new SetCardInfo("Spark Mage", 222, Rarity.UNCOMMON, mage.cards.s.SparkMage.class));
        cards.add(new SetCardInfo("Spellbane Centaur", 271, Rarity.RARE, mage.cards.s.SpellbaneCentaur.class));
        cards.add(new SetCardInfo("Spiritualize", 53, Rarity.UNCOMMON, mage.cards.s.Spiritualize.class));
        cards.add(new SetCardInfo("Springing Tiger", 272, Rarity.COMMON, mage.cards.s.SpringingTiger.class));
        cards.add(new SetCardInfo("Squirrel Mob", 273, Rarity.RARE, mage.cards.s.SquirrelMob.class));
        cards.add(new SetCardInfo("Squirrel Nest", 274, Rarity.UNCOMMON, mage.cards.s.SquirrelNest.class));
        cards.add(new SetCardInfo("Stalking Bloodsucker", 163, Rarity.RARE, mage.cards.s.StalkingBloodsucker.class));
        cards.add(new SetCardInfo("Standstill", 102, Rarity.UNCOMMON, mage.cards.s.Standstill.class));
        cards.add(new SetCardInfo("Still Life", 275, Rarity.UNCOMMON, mage.cards.s.StillLife.class));
        cards.add(new SetCardInfo("Stone-Tongue Basilisk", 276, Rarity.RARE, mage.cards.s.StoneTongueBasilisk.class));
        cards.add(new SetCardInfo("Sungrass Egg", 311, Rarity.UNCOMMON, mage.cards.s.SungrassEgg.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 328, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sylvan Might", 277, Rarity.UNCOMMON, mage.cards.s.SylvanMight.class));
        cards.add(new SetCardInfo("Syncopate", 103, Rarity.COMMON, mage.cards.s.Syncopate.class));
        cards.add(new SetCardInfo("Tainted Pact", 164, Rarity.RARE, mage.cards.t.TaintedPact.class));
        cards.add(new SetCardInfo("Tarnished Citadel", 329, Rarity.RARE, mage.cards.t.TarnishedCitadel.class));
        cards.add(new SetCardInfo("Terravore", 278, Rarity.RARE, mage.cards.t.Terravore.class));
        cards.add(new SetCardInfo("Testament of Faith", 55, Rarity.UNCOMMON, mage.cards.t.TestamentOfFaith.class));
        cards.add(new SetCardInfo("Thaumatog", 295, Rarity.UNCOMMON, mage.cards.t.Thaumatog.class));
        cards.add(new SetCardInfo("Thermal Blast", 224, Rarity.COMMON, mage.cards.t.ThermalBlast.class));
        cards.add(new SetCardInfo("Think Tank", 104, Rarity.UNCOMMON, mage.cards.t.ThinkTank.class));
        cards.add(new SetCardInfo("Thought Devourer", 105, Rarity.RARE, mage.cards.t.ThoughtDevourer.class));
        cards.add(new SetCardInfo("Thought Eater", 106, Rarity.UNCOMMON, mage.cards.t.ThoughtEater.class));
        cards.add(new SetCardInfo("Thought Nibbler", 107, Rarity.COMMON, mage.cards.t.ThoughtNibbler.class));
        cards.add(new SetCardInfo("Timberland Ruins", 330, Rarity.COMMON, mage.cards.t.TimberlandRuins.class));
        cards.add(new SetCardInfo("Time Stretch", 108, Rarity.RARE, mage.cards.t.TimeStretch.class));
        cards.add(new SetCardInfo("Tireless Tribe", 56, Rarity.COMMON, mage.cards.t.TirelessTribe.class));
        cards.add(new SetCardInfo("Tombfire", 165, Rarity.RARE, mage.cards.t.Tombfire.class));
        cards.add(new SetCardInfo("Touch of Invisibility", 109, Rarity.COMMON, mage.cards.t.TouchOfInvisibility.class));
        cards.add(new SetCardInfo("Traumatize", 110, Rarity.RARE, mage.cards.t.Traumatize.class));
        cards.add(new SetCardInfo("Treetop Sentinel", 111, Rarity.UNCOMMON, mage.cards.t.TreetopSentinel.class));
        cards.add(new SetCardInfo("Tremble", 225, Rarity.COMMON, mage.cards.t.Tremble.class));
        cards.add(new SetCardInfo("Unifying Theory", 112, Rarity.RARE, mage.cards.u.UnifyingTheory.class));
        cards.add(new SetCardInfo("Upheaval", 113, Rarity.RARE, mage.cards.u.Upheaval.class));
        cards.add(new SetCardInfo("Vampiric Dragon", 296, Rarity.RARE, mage.cards.v.VampiricDragon.class));
        cards.add(new SetCardInfo("Vivify", 281, Rarity.UNCOMMON, mage.cards.v.Vivify.class));
        cards.add(new SetCardInfo("Volcanic Spray", 226, Rarity.UNCOMMON, mage.cards.v.VolcanicSpray.class));
        cards.add(new SetCardInfo("Volley of Boulders", 227, Rarity.RARE, mage.cards.v.VolleyOfBoulders.class));
        cards.add(new SetCardInfo("Wayward Angel", 57, Rarity.RARE, mage.cards.w.WaywardAngel.class));
        cards.add(new SetCardInfo("Werebear", 282, Rarity.COMMON, mage.cards.w.Werebear.class));
        cards.add(new SetCardInfo("Whipkeeper", 228, Rarity.UNCOMMON, mage.cards.w.Whipkeeper.class));
        cards.add(new SetCardInfo("Whispering Shade", 167, Rarity.COMMON, mage.cards.w.WhisperingShade.class));
        cards.add(new SetCardInfo("Wild Mongrel", 283, Rarity.COMMON, mage.cards.w.WildMongrel.class));
        cards.add(new SetCardInfo("Woodland Druid", 284, Rarity.COMMON, mage.cards.w.WoodlandDruid.class));
        cards.add(new SetCardInfo("Words of Wisdom", 114, Rarity.COMMON, mage.cards.w.WordsOfWisdom.class));
        cards.add(new SetCardInfo("Zombie Assassin", 168, Rarity.COMMON, mage.cards.z.ZombieAssassin.class));
        cards.add(new SetCardInfo("Zombie Cannibal", 169, Rarity.COMMON, mage.cards.z.ZombieCannibal.class));
        cards.add(new SetCardInfo("Zombie Infestation", 170, Rarity.UNCOMMON, mage.cards.z.ZombieInfestation.class));
        cards.add(new SetCardInfo("Zombify", 171, Rarity.UNCOMMON, mage.cards.z.Zombify.class));
        cards.add(new SetCardInfo("Zoologist", 285, Rarity.RARE, mage.cards.z.Zoologist.class));
    }
}
