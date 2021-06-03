package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class ModernHorizons2 extends ExpansionSet {

    private static final ModernHorizons2 instance = new ModernHorizons2();

    public static ModernHorizons2 getInstance() {
        return instance;
    }

    private ModernHorizons2() {
        super("Modern Horizons 2", "MH2", ExpansionSet.buildDate(2021, 6, 11), SetType.SUPPLEMENTAL_MODERN_LEGAL);
        this.blockName = "Modern Horizons 2";
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 303;

        cards.add(new SetCardInfo("Abiding Grace", 1, Rarity.UNCOMMON, mage.cards.a.AbidingGrace.class));
        cards.add(new SetCardInfo("Abundant Harvest", 147, Rarity.COMMON, mage.cards.a.AbundantHarvest.class));
        cards.add(new SetCardInfo("Aeromoeba", 37, Rarity.COMMON, mage.cards.a.Aeromoeba.class));
        cards.add(new SetCardInfo("Aeve, Progenitor Ooze", 148, Rarity.RARE, mage.cards.a.AeveProgenitorOoze.class));
        cards.add(new SetCardInfo("Angelic Curator", 262, Rarity.UNCOMMON, mage.cards.a.AngelicCurator.class));
        cards.add(new SetCardInfo("Arcbound Javelineer", 2, Rarity.UNCOMMON, mage.cards.a.ArcboundJavelineer.class));
        cards.add(new SetCardInfo("Arcbound Mouser", 3, Rarity.COMMON, mage.cards.a.ArcboundMouser.class));
        cards.add(new SetCardInfo("Arcbound Prototype", 4, Rarity.COMMON, mage.cards.a.ArcboundPrototype.class));
        cards.add(new SetCardInfo("Arcbound Shikari", 184, Rarity.UNCOMMON, mage.cards.a.ArcboundShikari.class));
        cards.add(new SetCardInfo("Arcbound Slasher", 111, Rarity.COMMON, mage.cards.a.ArcboundSlasher.class));
        cards.add(new SetCardInfo("Arcbound Tracker", 112, Rarity.COMMON, mage.cards.a.ArcboundTracker.class));
        cards.add(new SetCardInfo("Arcbound Whelp", 113, Rarity.UNCOMMON, mage.cards.a.ArcboundWhelp.class));
        cards.add(new SetCardInfo("Archfiend of Sorrows", 74, Rarity.UNCOMMON, mage.cards.a.ArchfiendOfSorrows.class));
        cards.add(new SetCardInfo("Archon of Cruelty", 75, Rarity.MYTHIC, mage.cards.a.ArchonOfCruelty.class));
        cards.add(new SetCardInfo("Arcus Acolyte", 185, Rarity.UNCOMMON, mage.cards.a.ArcusAcolyte.class));
        cards.add(new SetCardInfo("Arid Mesa", 244, Rarity.RARE, mage.cards.a.AridMesa.class));
        cards.add(new SetCardInfo("Asmoranomardicadaistinaculdacar", 186, Rarity.RARE, mage.cards.a.Asmoranomardicadaistinaculdacar.class));
        cards.add(new SetCardInfo("Bannerhide Krushok", 149, Rarity.COMMON, mage.cards.b.BannerhideKrushok.class));
        cards.add(new SetCardInfo("Barbed Spike", 5, Rarity.UNCOMMON, mage.cards.b.BarbedSpike.class));
        cards.add(new SetCardInfo("Batterbone", 221, Rarity.UNCOMMON, mage.cards.b.Batterbone.class));
        cards.add(new SetCardInfo("Battle Plan", 114, Rarity.COMMON, mage.cards.b.BattlePlan.class));
        cards.add(new SetCardInfo("Blacksmith's Skill", 6, Rarity.COMMON, mage.cards.b.BlacksmithsSkill.class));
        cards.add(new SetCardInfo("Bloodbraid Marauder", 116, Rarity.RARE, mage.cards.b.BloodbraidMarauder.class));
        cards.add(new SetCardInfo("Blossoming Calm", 7, Rarity.UNCOMMON, mage.cards.b.BlossomingCalm.class));
        cards.add(new SetCardInfo("Bone Shards", 76, Rarity.COMMON, mage.cards.b.BoneShards.class));
        cards.add(new SetCardInfo("Bone Shredder", 272, Rarity.UNCOMMON, mage.cards.b.BoneShredder.class));
        cards.add(new SetCardInfo("Bottle Golems", 222, Rarity.COMMON, mage.cards.b.BottleGolems.class));
        cards.add(new SetCardInfo("Braids, Cabal Minion", 273, Rarity.RARE, mage.cards.b.BraidsCabalMinion.class));
        cards.add(new SetCardInfo("Brainstone", 223, Rarity.UNCOMMON, mage.cards.b.Brainstone.class));
        cards.add(new SetCardInfo("Break Ties", 8, Rarity.COMMON, mage.cards.b.BreakTies.class));
        cards.add(new SetCardInfo("Break the Ice", 77, Rarity.UNCOMMON, mage.cards.b.BreakTheIce.class));
        cards.add(new SetCardInfo("Breathless Knight", 187, Rarity.COMMON, mage.cards.b.BreathlessKnight.class));
        cards.add(new SetCardInfo("Breya's Apprentice", 117, Rarity.RARE, mage.cards.b.BreyasApprentice.class));
        cards.add(new SetCardInfo("Cabal Coffers", 301, Rarity.MYTHIC, mage.cards.c.CabalCoffers.class));
        cards.add(new SetCardInfo("Calibrated Blast", 118, Rarity.RARE, mage.cards.c.CalibratedBlast.class));
        cards.add(new SetCardInfo("Captain Ripley Vance", 119, Rarity.UNCOMMON, mage.cards.c.CaptainRipleyVance.class));
        cards.add(new SetCardInfo("Captured by Lagacs", 188, Rarity.COMMON, mage.cards.c.CapturedByLagacs.class));
        cards.add(new SetCardInfo("Chainer, Nightmare Adept", 289, Rarity.RARE, mage.cards.c.ChainerNightmareAdept.class));
        cards.add(new SetCardInfo("Chance Encounter", 277, Rarity.RARE, mage.cards.c.ChanceEncounter.class));
        cards.add(new SetCardInfo("Chatterstorm", 152, Rarity.COMMON, mage.cards.c.Chatterstorm.class));
        cards.add(new SetCardInfo("Chitterspitter", 153, Rarity.RARE, mage.cards.c.Chitterspitter.class));
        cards.add(new SetCardInfo("Chrome Courier", 190, Rarity.COMMON, mage.cards.c.ChromeCourier.class));
        cards.add(new SetCardInfo("Combine Chrysalis", 191, Rarity.UNCOMMON, mage.cards.c.CombineChrysalis.class));
        cards.add(new SetCardInfo("Constable of the Realm", 10, Rarity.UNCOMMON, mage.cards.c.ConstableOfTheRealm.class));
        cards.add(new SetCardInfo("Counterspell", 267, Rarity.UNCOMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crack Open", 154, Rarity.COMMON, mage.cards.c.CrackOpen.class));
        cards.add(new SetCardInfo("Cursed Totem", 295, Rarity.RARE, mage.cards.c.CursedTotem.class));
        cards.add(new SetCardInfo("Dakkon, Shadow Slayer", 192, Rarity.MYTHIC, mage.cards.d.DakkonShadowSlayer.class));
        cards.add(new SetCardInfo("Darkmoss Bridge", 245, Rarity.COMMON, mage.cards.d.DarkmossBridge.class));
        cards.add(new SetCardInfo("Diamond Lion", 225, Rarity.RARE, mage.cards.d.DiamondLion.class));
        cards.add(new SetCardInfo("Discerning Taste", 82, Rarity.COMMON, mage.cards.d.DiscerningTaste.class));
        cards.add(new SetCardInfo("Dragon's Rage Channeler", 121, Rarity.UNCOMMON, mage.cards.d.DragonsRageChanneler.class));
        cards.add(new SetCardInfo("Dress Down", 39, Rarity.RARE, mage.cards.d.DressDown.class));
        cards.add(new SetCardInfo("Drey Keeper", 194, Rarity.COMMON, mage.cards.d.DreyKeeper.class));
        cards.add(new SetCardInfo("Drossforge Bridge", 246, Rarity.COMMON, mage.cards.d.DrossforgeBridge.class));
        cards.add(new SetCardInfo("Echoing Return", 83, Rarity.COMMON, mage.cards.e.EchoingReturn.class));
        cards.add(new SetCardInfo("Enchantress's Presence", 283, Rarity.RARE, mage.cards.e.EnchantresssPresence.class));
        cards.add(new SetCardInfo("Endurance", 157, Rarity.MYTHIC, mage.cards.e.Endurance.class));
        cards.add(new SetCardInfo("Esper Sentinel", 12, Rarity.RARE, mage.cards.e.EsperSentinel.class));
        cards.add(new SetCardInfo("Ethersworn Sphinx", 195, Rarity.UNCOMMON, mage.cards.e.EtherswornSphinx.class));
        cards.add(new SetCardInfo("Extruder", 296, Rarity.UNCOMMON, mage.cards.e.Extruder.class));
        cards.add(new SetCardInfo("Fae Offering", 158, Rarity.UNCOMMON, mage.cards.f.FaeOffering.class));
        cards.add(new SetCardInfo("Faithless Salvaging", 122, Rarity.COMMON, mage.cards.f.FaithlessSalvaging.class));
        cards.add(new SetCardInfo("Fast // Furious", 123, Rarity.UNCOMMON, mage.cards.f.FastFurious.class));
        cards.add(new SetCardInfo("Feast of Sanity", 84, Rarity.UNCOMMON, mage.cards.f.FeastOfSanity.class));
        cards.add(new SetCardInfo("Filigree Attendant", 41, Rarity.UNCOMMON, mage.cards.f.FiligreeAttendant.class));
        cards.add(new SetCardInfo("Fire // Ice", 290, Rarity.RARE, mage.cards.f.FireIce.class));
        cards.add(new SetCardInfo("Flame Blitz", 124, Rarity.UNCOMMON, mage.cards.f.FlameBlitz.class));
        cards.add(new SetCardInfo("Flame Rift", 278, Rarity.UNCOMMON, mage.cards.f.FlameRift.class));
        cards.add(new SetCardInfo("Flametongue Yearling", 125, Rarity.UNCOMMON, mage.cards.f.FlametongueYearling.class));
        cards.add(new SetCardInfo("Flay Essence", 85, Rarity.UNCOMMON, mage.cards.f.FlayEssence.class));
        cards.add(new SetCardInfo("Floodhound", 42, Rarity.COMMON, mage.cards.f.Floodhound.class));
        cards.add(new SetCardInfo("Flourishing Strike", 159, Rarity.COMMON, mage.cards.f.FlourishingStrike.class));
        cards.add(new SetCardInfo("Fodder Tosser", 226, Rarity.COMMON, mage.cards.f.FodderTosser.class));
        cards.add(new SetCardInfo("Forest", 489, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Foundation Breaker", 160, Rarity.UNCOMMON, mage.cards.f.FoundationBreaker.class));
        cards.add(new SetCardInfo("Fractured Sanity", 44, Rarity.RARE, mage.cards.f.FracturedSanity.class));
        cards.add(new SetCardInfo("Funnel-Web Recluse", 161, Rarity.COMMON, mage.cards.f.FunnelWebRecluse.class));
        cards.add(new SetCardInfo("Fury", 126, Rarity.MYTHIC, mage.cards.f.Fury.class));
        cards.add(new SetCardInfo("Gaea's Will", 162, Rarity.RARE, mage.cards.g.GaeasWill.class));
        cards.add(new SetCardInfo("General Ferrous Rokiric", 198, Rarity.RARE, mage.cards.g.GeneralFerrousRokiric.class));
        cards.add(new SetCardInfo("Geyadrone Dihada", 199, Rarity.MYTHIC, mage.cards.g.GeyadroneDihada.class));
        cards.add(new SetCardInfo("Ghost-Lit Drifter", 45, Rarity.UNCOMMON, mage.cards.g.GhostLitDrifter.class));
        cards.add(new SetCardInfo("Glimmer Bairn", 163, Rarity.COMMON, mage.cards.g.GlimmerBairn.class));
        cards.add(new SetCardInfo("Glinting Creeper", 164, Rarity.UNCOMMON, mage.cards.g.GlintingCreeper.class));
        cards.add(new SetCardInfo("Glorious Enforcer", 14, Rarity.UNCOMMON, mage.cards.g.GloriousEnforcer.class));
        cards.add(new SetCardInfo("Goblin Anarchomancer", 200, Rarity.COMMON, mage.cards.g.GoblinAnarchomancer.class));
        cards.add(new SetCardInfo("Goblin Bombardment", 279, Rarity.RARE, mage.cards.g.GoblinBombardment.class));
        cards.add(new SetCardInfo("Goldmire Bridge", 247, Rarity.COMMON, mage.cards.g.GoldmireBridge.class));
        cards.add(new SetCardInfo("Gorilla Shaman", 280, Rarity.UNCOMMON, mage.cards.g.GorillaShaman.class));
        cards.add(new SetCardInfo("Graceful Restoration", 201, Rarity.UNCOMMON, mage.cards.g.GracefulRestoration.class));
        cards.add(new SetCardInfo("Greed", 274, Rarity.UNCOMMON, mage.cards.g.Greed.class));
        cards.add(new SetCardInfo("Grief", 87, Rarity.MYTHIC, mage.cards.g.Grief.class));
        cards.add(new SetCardInfo("Hard Evidence", 46, Rarity.COMMON, mage.cards.h.HardEvidence.class));
        cards.add(new SetCardInfo("Harmonic Prodigy", 132, Rarity.RARE, mage.cards.h.HarmonicProdigy.class));
        cards.add(new SetCardInfo("Hell Mongrel", 88, Rarity.COMMON, mage.cards.h.HellMongrel.class));
        cards.add(new SetCardInfo("Herd Baloth", 165, Rarity.UNCOMMON, mage.cards.h.HerdBaloth.class));
        cards.add(new SetCardInfo("Hunting Pack", 284, Rarity.UNCOMMON, mage.cards.h.HuntingPack.class));
        cards.add(new SetCardInfo("Ignoble Hierarch", 166, Rarity.RARE, mage.cards.i.IgnobleHierarch.class));
        cards.add(new SetCardInfo("Imperial Recruiter", 281, Rarity.MYTHIC, mage.cards.i.ImperialRecruiter.class));
        cards.add(new SetCardInfo("Island", 483, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jade Avenger", 167, Rarity.COMMON, mage.cards.j.JadeAvenger.class));
        cards.add(new SetCardInfo("Jewel-Eyed Cobra", 168, Rarity.COMMON, mage.cards.j.JewelEyedCobra.class));
        cards.add(new SetCardInfo("Junk Winder", 48, Rarity.UNCOMMON, mage.cards.j.JunkWinder.class));
        cards.add(new SetCardInfo("Kaleidoscorch", 133, Rarity.UNCOMMON, mage.cards.k.Kaleidoscorch.class));
        cards.add(new SetCardInfo("Karmic Guide", 263, Rarity.RARE, mage.cards.k.KarmicGuide.class));
        cards.add(new SetCardInfo("Kitchen Imp", 89, Rarity.COMMON, mage.cards.k.KitchenImp.class));
        cards.add(new SetCardInfo("Landscaper Colos", 18, Rarity.COMMON, mage.cards.l.LandscaperColos.class));
        cards.add(new SetCardInfo("Late to Dinner", 19, Rarity.COMMON, mage.cards.l.LateToDinner.class));
        cards.add(new SetCardInfo("Lazotep Chancellor", 203, Rarity.UNCOMMON, mage.cards.l.LazotepChancellor.class));
        cards.add(new SetCardInfo("Legion Vanguard", 90, Rarity.UNCOMMON, mage.cards.l.LegionVanguard.class));
        cards.add(new SetCardInfo("Liquimetal Torque", 228, Rarity.UNCOMMON, mage.cards.l.LiquimetalTorque.class));
        cards.add(new SetCardInfo("Lose Focus", 49, Rarity.COMMON, mage.cards.l.LoseFocus.class));
        cards.add(new SetCardInfo("Lucid Dreams", 50, Rarity.UNCOMMON, mage.cards.l.LucidDreams.class));
        cards.add(new SetCardInfo("Marble Gargoyle", 21, Rarity.COMMON, mage.cards.m.MarbleGargoyle.class));
        cards.add(new SetCardInfo("Marsh Flats", 248, Rarity.RARE, mage.cards.m.MarshFlats.class));
        cards.add(new SetCardInfo("Master of Death", 205, Rarity.RARE, mage.cards.m.MasterOfDeath.class));
        cards.add(new SetCardInfo("Mental Journey", 51, Rarity.COMMON, mage.cards.m.MentalJourney.class));
        cards.add(new SetCardInfo("Millikin", 297, Rarity.UNCOMMON, mage.cards.m.Millikin.class));
        cards.add(new SetCardInfo("Mirari's Wake", 291, Rarity.MYTHIC, mage.cards.m.MirarisWake.class));
        cards.add(new SetCardInfo("Mishra's Factory", 302, Rarity.UNCOMMON, mage.cards.m.MishrasFactory.class));
        cards.add(new SetCardInfo("Mistvault Bridge", 249, Rarity.COMMON, mage.cards.m.MistvaultBridge.class));
        cards.add(new SetCardInfo("Misty Rainforest", 250, Rarity.RARE, mage.cards.m.MistyRainforest.class));
        cards.add(new SetCardInfo("Moderation", 206, Rarity.RARE, mage.cards.m.Moderation.class));
        cards.add(new SetCardInfo("Mogg Salvage", 282, Rarity.UNCOMMON, mage.cards.m.MoggSalvage.class));
        cards.add(new SetCardInfo("Monoskelion", 229, Rarity.UNCOMMON, mage.cards.m.Monoskelion.class));
        cards.add(new SetCardInfo("Mountain", 487, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myr Scrapling", 230, Rarity.COMMON, mage.cards.m.MyrScrapling.class));
        cards.add(new SetCardInfo("Mystic Redaction", 53, Rarity.UNCOMMON, mage.cards.m.MysticRedaction.class));
        cards.add(new SetCardInfo("Necromancer's Familiar", 94, Rarity.UNCOMMON, mage.cards.n.NecromancersFamiliar.class));
        cards.add(new SetCardInfo("Nettlecyst", 231, Rarity.RARE, mage.cards.n.Nettlecyst.class));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 298, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class));
        cards.add(new SetCardInfo("Obsidian Charmaw", 137, Rarity.RARE, mage.cards.o.ObsidianCharmaw.class));
        cards.add(new SetCardInfo("Orchard Strider", 169, Rarity.COMMON, mage.cards.o.OrchardStrider.class));
        cards.add(new SetCardInfo("Ornithopter of Paradise", 232, Rarity.COMMON, mage.cards.o.OrnithopterOfParadise.class));
        cards.add(new SetCardInfo("Parcel Myr", 54, Rarity.COMMON, mage.cards.p.ParcelMyr.class));
        cards.add(new SetCardInfo("Patchwork Gnomes", 299, Rarity.COMMON, mage.cards.p.PatchworkGnomes.class));
        cards.add(new SetCardInfo("Patriarch's Bidding", 275, Rarity.RARE, mage.cards.p.PatriarchsBidding.class));
        cards.add(new SetCardInfo("Phantasmal Dreadmaw", 55, Rarity.COMMON, mage.cards.p.PhantasmalDreadmaw.class));
        cards.add(new SetCardInfo("Piru, the Volatile", 207, Rarity.RARE, mage.cards.p.PiruTheVolatile.class));
        cards.add(new SetCardInfo("Plains", 481, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Priest of Fell Rites", 208, Rarity.RARE, mage.cards.p.PriestOfFellRites.class));
        cards.add(new SetCardInfo("Prismatic Ending", 25, Rarity.UNCOMMON, mage.cards.p.PrismaticEnding.class));
        cards.add(new SetCardInfo("Profane Tutor", 97, Rarity.RARE, mage.cards.p.ProfaneTutor.class));
        cards.add(new SetCardInfo("Prophetic Titan", 209, Rarity.UNCOMMON, mage.cards.p.PropheticTitan.class));
        cards.add(new SetCardInfo("Quirion Ranger", 285, Rarity.UNCOMMON, mage.cards.q.QuirionRanger.class));
        cards.add(new SetCardInfo("Radiant Epicure", 98, Rarity.UNCOMMON, mage.cards.r.RadiantEpicure.class));
        cards.add(new SetCardInfo("Rakdos Headliner", 210, Rarity.UNCOMMON, mage.cards.r.RakdosHeadliner.class));
        cards.add(new SetCardInfo("Ravenous Squirrel", 211, Rarity.UNCOMMON, mage.cards.r.RavenousSquirrel.class));
        cards.add(new SetCardInfo("Raving Visionary", 56, Rarity.UNCOMMON, mage.cards.r.RavingVisionary.class));
        cards.add(new SetCardInfo("Razortide Bridge", 252, Rarity.COMMON, mage.cards.r.RazortideBridge.class));
        cards.add(new SetCardInfo("Rift Sower", 170, Rarity.COMMON, mage.cards.r.RiftSower.class));
        cards.add(new SetCardInfo("Riptide Laboratory", 303, Rarity.RARE, mage.cards.r.RiptideLaboratory.class));
        cards.add(new SetCardInfo("Rishadan Dockhand", 59, Rarity.RARE, mage.cards.r.RishadanDockhand.class));
        cards.add(new SetCardInfo("Road // Ruin", 212, Rarity.UNCOMMON, mage.cards.r.RoadRuin.class));
        cards.add(new SetCardInfo("Rustvale Bridge", 253, Rarity.COMMON, mage.cards.r.RustvaleBridge.class));
        cards.add(new SetCardInfo("Sanctuary Raptor", 233, Rarity.UNCOMMON, mage.cards.s.SanctuaryRaptor.class));
        cards.add(new SetCardInfo("Sanctum Prelate", 491, Rarity.MYTHIC, mage.cards.s.SanctumPrelate.class));
        cards.add(new SetCardInfo("Sanctum Weaver", 171, Rarity.RARE, mage.cards.s.SanctumWeaver.class));
        cards.add(new SetCardInfo("Scalding Tarn", 254, Rarity.RARE, mage.cards.s.ScaldingTarn.class));
        cards.add(new SetCardInfo("Scion of Draco", 234, Rarity.MYTHIC, mage.cards.s.ScionOfDraco.class));
        cards.add(new SetCardInfo("Scour the Desert", 28, Rarity.UNCOMMON, mage.cards.s.ScourTheDesert.class));
        cards.add(new SetCardInfo("Scurry Oak", 172, Rarity.UNCOMMON, mage.cards.s.ScurryOak.class));
        cards.add(new SetCardInfo("Scuttletide", 61, Rarity.UNCOMMON, mage.cards.s.Scuttletide.class));
        cards.add(new SetCardInfo("Sea Drake", 268, Rarity.UNCOMMON, mage.cards.s.SeaDrake.class));
        cards.add(new SetCardInfo("Seal of Cleansing", 264, Rarity.UNCOMMON, mage.cards.s.SealOfCleansing.class));
        cards.add(new SetCardInfo("Seal of Removal", 269, Rarity.UNCOMMON, mage.cards.s.SealOfRemoval.class));
        cards.add(new SetCardInfo("Search the Premises", 29, Rarity.RARE, mage.cards.s.SearchThePremises.class));
        cards.add(new SetCardInfo("Shardless Agent", 292, Rarity.RARE, mage.cards.s.ShardlessAgent.class));
        cards.add(new SetCardInfo("Shattered Ego", 62, Rarity.COMMON, mage.cards.s.ShatteredEgo.class));
        cards.add(new SetCardInfo("Silverbluff Bridge", 255, Rarity.COMMON, mage.cards.s.SilverbluffBridge.class));
        cards.add(new SetCardInfo("Sinister Starfish", 99, Rarity.COMMON, mage.cards.s.SinisterStarfish.class));
        cards.add(new SetCardInfo("Skirge Familiar", 276, Rarity.UNCOMMON, mage.cards.s.SkirgeFamiliar.class));
        cards.add(new SetCardInfo("Skophos Reaver", 140, Rarity.COMMON, mage.cards.s.SkophosReaver.class));
        cards.add(new SetCardInfo("Slag Strider", 141, Rarity.UNCOMMON, mage.cards.s.SlagStrider.class));
        cards.add(new SetCardInfo("Slagwoods Bridge", 256, Rarity.COMMON, mage.cards.s.SlagwoodsBridge.class));
        cards.add(new SetCardInfo("Sol Talisman", 236, Rarity.RARE, mage.cards.s.SolTalisman.class));
        cards.add(new SetCardInfo("Solitary Confinement", 265, Rarity.RARE, mage.cards.s.SolitaryConfinement.class));
        cards.add(new SetCardInfo("Solitude", 32, Rarity.MYTHIC, mage.cards.s.Solitude.class));
        cards.add(new SetCardInfo("Soul Snare", 266, Rarity.UNCOMMON, mage.cards.s.SoulSnare.class));
        cards.add(new SetCardInfo("Soul of Migration", 33, Rarity.COMMON, mage.cards.s.SoulOfMigration.class));
        cards.add(new SetCardInfo("Specimen Collector", 64, Rarity.UNCOMMON, mage.cards.s.SpecimenCollector.class));
        cards.add(new SetCardInfo("Spreading Insurrection", 142, Rarity.UNCOMMON, mage.cards.s.SpreadingInsurrection.class));
        cards.add(new SetCardInfo("Squirrel Mob", 286, Rarity.RARE, mage.cards.s.SquirrelMob.class));
        cards.add(new SetCardInfo("Squirrel Sanctuary", 174, Rarity.UNCOMMON, mage.cards.s.SquirrelSanctuary.class));
        cards.add(new SetCardInfo("Squirrel Sovereign", 175, Rarity.UNCOMMON, mage.cards.s.SquirrelSovereign.class));
        cards.add(new SetCardInfo("Steelfin Whale", 65, Rarity.COMMON, mage.cards.s.SteelfinWhale.class));
        cards.add(new SetCardInfo("Step Through", 66, Rarity.COMMON, mage.cards.s.StepThrough.class));
        cards.add(new SetCardInfo("Sterling Grove", 293, Rarity.RARE, mage.cards.s.SterlingGrove.class));
        cards.add(new SetCardInfo("Storm God's Oracle", 213, Rarity.COMMON, mage.cards.s.StormGodsOracle.class));
        cards.add(new SetCardInfo("Strike It Rich", 143, Rarity.UNCOMMON, mage.cards.s.StrikeItRich.class));
        cards.add(new SetCardInfo("Subtlety", 67, Rarity.MYTHIC, mage.cards.s.Subtlety.class));
        cards.add(new SetCardInfo("Sudden Edict", 100, Rarity.UNCOMMON, mage.cards.s.SuddenEdict.class));
        cards.add(new SetCardInfo("Svyelun of Sea and Sky", 69, Rarity.MYTHIC, mage.cards.s.SvyelunOfSeaAndSky.class));
        cards.add(new SetCardInfo("Swamp", 485, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sweep the Skies", 70, Rarity.UNCOMMON, mage.cards.s.SweepTheSkies.class));
        cards.add(new SetCardInfo("Sylvan Anthem", 176, Rarity.RARE, mage.cards.s.SylvanAnthem.class));
        cards.add(new SetCardInfo("Sythis, Harvest's Hand", 214, Rarity.RARE, mage.cards.s.SythisHarvestsHand.class));
        cards.add(new SetCardInfo("Tanglepool Bridge", 257, Rarity.COMMON, mage.cards.t.TanglepoolBridge.class));
        cards.add(new SetCardInfo("Tavern Scoundrel", 144, Rarity.COMMON, mage.cards.t.TavernScoundrel.class));
        cards.add(new SetCardInfo("Terminal Agony", 215, Rarity.COMMON, mage.cards.t.TerminalAgony.class));
        cards.add(new SetCardInfo("Terramorph", 177, Rarity.UNCOMMON, mage.cards.t.Terramorph.class));
        cards.add(new SetCardInfo("Territorial Kavu", 216, Rarity.RARE, mage.cards.t.TerritorialKavu.class));
        cards.add(new SetCardInfo("The Underworld Cookbook", 240, Rarity.UNCOMMON, mage.cards.t.TheUnderworldCookbook.class));
        cards.add(new SetCardInfo("Thornglint Bridge", 258, Rarity.COMMON, mage.cards.t.ThornglintBridge.class));
        cards.add(new SetCardInfo("Thought Monitor", 71, Rarity.RARE, mage.cards.t.ThoughtMonitor.class));
        cards.add(new SetCardInfo("Thraben Watcher", 34, Rarity.UNCOMMON, mage.cards.t.ThrabenWatcher.class));
        cards.add(new SetCardInfo("Thrasta, Tempest's Roar", 178, Rarity.MYTHIC, mage.cards.t.ThrastaTempestsRoar.class));
        cards.add(new SetCardInfo("Tide Shaper", 72, Rarity.UNCOMMON, mage.cards.t.TideShaper.class));
        cards.add(new SetCardInfo("Timeless Dragon", 35, Rarity.RARE, mage.cards.t.TimelessDragon.class));
        cards.add(new SetCardInfo("Timeless Witness", 179, Rarity.UNCOMMON, mage.cards.t.TimelessWitness.class));
        cards.add(new SetCardInfo("Tireless Provisioner", 180, Rarity.UNCOMMON, mage.cards.t.TirelessProvisioner.class));
        cards.add(new SetCardInfo("Titania, Protector of Argoth", 287, Rarity.MYTHIC, mage.cards.t.TitaniaProtectorOfArgoth.class));
        cards.add(new SetCardInfo("Tormod's Cryptkeeper", 239, Rarity.COMMON, mage.cards.t.TormodsCryptkeeper.class));
        cards.add(new SetCardInfo("Tourach's Canticle", 103, Rarity.COMMON, mage.cards.t.TourachsCanticle.class));
        cards.add(new SetCardInfo("Underworld Hermit", 105, Rarity.UNCOMMON, mage.cards.u.UnderworldHermit.class));
        cards.add(new SetCardInfo("Unmarked Grave", 106, Rarity.RARE, mage.cards.u.UnmarkedGrave.class));
        cards.add(new SetCardInfo("Upheaval", 270, Rarity.RARE, mage.cards.u.Upheaval.class));
        cards.add(new SetCardInfo("Urban Daggertooth", 181, Rarity.COMMON, mage.cards.u.UrbanDaggertooth.class));
        cards.add(new SetCardInfo("Urza's Saga", 259, Rarity.RARE, mage.cards.u.UrzasSaga.class));
        cards.add(new SetCardInfo("Vectis Gloves", 241, Rarity.UNCOMMON, mage.cards.v.VectisGloves.class));
        cards.add(new SetCardInfo("Vedalken Infiltrator", 73, Rarity.UNCOMMON, mage.cards.v.VedalkenInfiltrator.class));
        cards.add(new SetCardInfo("Verdant Catacombs", 260, Rarity.RARE, mage.cards.v.VerdantCatacombs.class));
        cards.add(new SetCardInfo("Verdant Command", 182, Rarity.RARE, mage.cards.v.VerdantCommand.class));
        cards.add(new SetCardInfo("Viashino Lashclaw", 146, Rarity.COMMON, mage.cards.v.ViashinoLashclaw.class));
        cards.add(new SetCardInfo("Vindicate", 294, Rarity.RARE, mage.cards.v.Vindicate.class));
        cards.add(new SetCardInfo("Void Mirror", 242, Rarity.RARE, mage.cards.v.VoidMirror.class));
        cards.add(new SetCardInfo("Wonder", 271, Rarity.RARE, mage.cards.w.Wonder.class));
        cards.add(new SetCardInfo("World-Weary", 109, Rarity.COMMON, mage.cards.w.WorldWeary.class));
        cards.add(new SetCardInfo("Wren's Run Hydra", 183, Rarity.UNCOMMON, mage.cards.w.WrensRunHydra.class));
        cards.add(new SetCardInfo("Yavimaya Elder", 288, Rarity.UNCOMMON, mage.cards.y.YavimayaElder.class));
        cards.add(new SetCardInfo("Young Necromancer", 110, Rarity.UNCOMMON, mage.cards.y.YoungNecromancer.class));
        cards.add(new SetCardInfo("Yusri, Fortune's Flame", 218, Rarity.RARE, mage.cards.y.YusriFortunesFlame.class));
        cards.add(new SetCardInfo("Zuran Orb", 300, Rarity.UNCOMMON, mage.cards.z.ZuranOrb.class));
    }
}
