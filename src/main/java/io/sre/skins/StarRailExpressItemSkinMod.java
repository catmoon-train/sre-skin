package io.sre.skins;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.wifi.starrailexpress.util.SkinManager;
import io.wifi.starrailexpress.util.SkinManager.QualityColor;
import io.wifi.starrailexpress.util.SkinManager.SkinTypes;

public class StarRailExpressItemSkinMod implements ModInitializer {
	public static final String MOD_ID = "starrail-express-item-skin-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void registerSkin(String skinType, String skinID, int color) {
		SkinManager.registerSkin(skinType, skinID, color);
	}

	public static void registerSkins(String skinType, QualityColor qualityColor, String... skinIDs) {
		for (String skinID : skinIDs) {
			registerSkin(skinType, skinID, qualityColor.getColor());
		}
	}

	@Override
	public void onInitialize() {
		// API
		registerSkin(SkinTypes.KNIFE, "ceremonial", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "pick", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "diamond_knife", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "dagger", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "rainbow_knife", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "fly_cutter", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "storm_blade", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "dragon_blade", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "chopper", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "neptune_knife", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "colorful_folding_knife", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "edge_knife", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "blue_curved_knife", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "balisong", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "black_blade", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "blade_of_blood_red", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "blue_knife", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "carrot_knife", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "cat_paw", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "cultist", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "cutter_knife", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "dart", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "diamond_knife", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "dusks_epitaph", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "fork", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "icicle", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "light_sword", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "machete", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "matchstick_sword", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "missing_source", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "missing_sword", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "herring_sword_fish", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "nail", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "peach_stick", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "red_light_sword", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "starlight", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "sword_in_stone", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "harpy_star", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "quenched_titanium", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "tianjie_bit", QualityColor.LEGENDARY.getColor());

		// New knife skins
		registerSkin(SkinTypes.KNIFE, "bear_claw", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "broken_bottle", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "chicken_sword", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "ew_knife", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "flaying_knife", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "flesh_and_blood_resonance", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "foxy_blade", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "ice_fish", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "katar", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "kunai", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.KNIFE, "ninja_claw", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "real_sword", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "small_real_knife", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "steel_claw", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "swiss_army_knife", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "tenet", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "thousands_source", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "zenith_knife", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "gamma_doppler_claw_knife", QualityColor.UNBELIEVABLE.getColor());

		// New knife skins 2025
		registerSkin(SkinTypes.KNIFE, "crystalline", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "folly_stick", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "glass", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.KNIFE, "golden_shear", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "jolly_stick", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.KNIFE, "makeshift", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.KNIFE, "roze", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "sweet_tooth", QualityColor.UNBELIEVABLE.getColor());

		// New knife skins 2026
		registerSkin(SkinTypes.KNIFE, "echoium_sword", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "giant_roasted_chicken", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "sacrificial_dagger", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "tianyuan_fairy", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "unconscious_knife", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.KNIFE, "tenet", QualityColor.LEGENDARY.getColor());

		// New knife skins 2026.4
		registerSkins(SkinTypes.KNIFE, QualityColor.UNCOMMON,
			"carp_knife", "not_cooked");
		registerSkins(SkinTypes.KNIFE, QualityColor.RARE,
			"brush", "glass_knife", "jett");
		registerSkins(SkinTypes.KNIFE, QualityColor.EPIC,
			"anubis", "blade_of_soul", "cheems_knife", "coral", "dark_sparks", "death_edge",
			"evolutionary_truster", "exknife", "flame_sword", "greed", "inflammatory_burial",
			"lightning_nunchakus", "zmd_fuyao", "zmd_guangrongjiyi");
		registerSkins(SkinTypes.KNIFE, QualityColor.LEGENDARY,
			"loyalty", "magnetite_sword", "mountain_opening", "ou_bu_rapier", "qingjian", "qu",
			"sapphire", "sapphire_feast", "scorching_heat", "scribbled_hammer", "sword_executioner",
			"time_limit_sword", "zmd_ansehuoju");
		registerSkins(SkinTypes.KNIFE, QualityColor.UNBELIEVABLE,
			"quill", "lightning_whip", "galaxy_spark", "head_dart", "scarlet_scar",
			"zmd_helafenge", "zmd_xiangxinzhiyin");

		// Initialize revolver skins
		registerSkin(SkinTypes.REVOLVER, "double_pistol", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "heavy_pistol", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "knife_gun", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "potato_launcher", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "stick_gun", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "water_gun", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "west_revolver", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "white_gun", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "desert_eagle", QualityColor.EPIC.getColor());

		// New gun skins (registerSkin uses REVOLVER type)
		registerSkin(SkinTypes.REVOLVER, "anshidian", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "cannon", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "caplock_pistol", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "coal_gun", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "colt_45", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "dragon_fractal", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "european_long_revolver", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "golden_gun", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "g18", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "habilis", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "hummingbird", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "infinity", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "izumo_41_style", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "lengcui", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "m3", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "margas_flintlock", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "minimalist_line", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "nail_gun", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "pixel_gun", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "potato_launcher", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "rust_lake", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "shengxuan_white", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "signal_gun", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "sine_wave", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "soul_cairn", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "stick_gun", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "time", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "uzi", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "water_gun", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "west_revolver", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "white_gun", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "wood_gun", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "woodcarving_pistol", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "carved_emperor", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "kekedi", QualityColor.EPIC.getColor());

		// New gun skins 2026
		registerSkin(SkinTypes.REVOLVER, "art_tyrant", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "burn_out_sulfur", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.REVOLVER, "white_gold_gun", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "canyue_gun", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "electrodynamics", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.REVOLVER, "qianxia", QualityColor.EPIC.getColor());

		// New gun skins 2026.4
		registerSkins(SkinTypes.REVOLVER, QualityColor.RARE,
			"glass_gun",
			"gold_defibrillator", "hattansang", "hunt_of_glory", "jungle_edge", "king_gun");
		registerSkins(SkinTypes.REVOLVER, QualityColor.EPIC,
			"lava_rock", "navy_then_issued_pistols", "rune_magic_bow", "sex_pistol", "spit_cattle",
			"strange_box", "the_moon", "thorn_slingshot", "tooth_3", "yellow_paper", "zero_purchase","beak_peak", "blue_rose", "close_relations", "devils_claws", "flower_sleep");
		registerSkins(SkinTypes.REVOLVER, QualityColor.LEGENDARY,
			"zmd_qizi", "zmd_wangxiang", "zmd_xiangshi");
		registerSkins(SkinTypes.REVOLVER, QualityColor.UNBELIEVABLE,
			"blackgold", "cat_gun", "divine", "eyeball", "golden_gyration",
			"zmd_gaobie", "zmd_linghangzhe", "zmd_luocao", "zmd_obj");

		// PVZ gun skins
		registerSkin(SkinTypes.REVOLVER, "pvz_peashooter", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.REVOLVER, "pvz_icemelon_gun", QualityColor.UNBELIEVABLE.getColor());

		// Initialize grenade skins
		registerSkin(SkinTypes.GRENADE, "big_bomb", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.GRENADE, "minecraft_tnt", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.GRENADE, "fire_charge", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.GRENADE, "magnetic_bomb", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "mobile", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "phone", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.GRENADE, "gas_cylinder", QualityColor.RARE.getColor());

		// New grenade skins
		registerSkin(SkinTypes.GRENADE, "bottled_flame", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.GRENADE, "brown_substance", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.GRENADE, "coordinate_system", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.GRENADE, "detonator", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.GRENADE, "exponential_explosion", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.GRENADE, "flying_knife_grenade", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.GRENADE, "fragmentation_grenade", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.GRENADE, "king_ball", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.GRENADE, "markov_chain", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.GRENADE, "mini_nuke", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "naval_mine", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "nugrenade", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "o_god_grenade", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.GRENADE, "pisces", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "rainbow_crepper_grenade", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.GRENADE, "rainbow_fireworks", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "rocket", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.GRENADE, "scorpio", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.GRENADE, "shiguimian", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.GRENADE, "submunition_mine", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "tnt", QualityColor.COMMON.getColor());

		// New grenade skins 2026
		registerSkin(SkinTypes.GRENADE, "lemon_grenade", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.GRENADE, "molotov_cocktail", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.GRENADE, "null_grenade", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "poop", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.GRENADE, "rock", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "voice_star", QualityColor.EPIC.getColor());

		// PVZ grenade skins
		registerSkin(SkinTypes.GRENADE, "pvz_cherrybomb", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "pvz_destruction_mushrooms", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.GRENADE, "pvz_jalapeno", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.GRENADE, "pvz_joke_box", QualityColor.LEGENDARY.getColor());

		// New grenade skins 2026
		registerSkin(SkinTypes.GRENADE, "slime_redstone_torch", QualityColor.RARE.getColor());

		// Supplemental grenade skins 2026.4
		registerSkins(SkinTypes.GRENADE, QualityColor.EPIC,
			"diablo", "dio", "engine_grenade", "final_times", "halo", "ice_dart", "indonesian_bytes",
			"jiliang_op", "kettle", "my_sword_shield", "rotary_iron_ball", "rune_blasting",
			"standdisc", "taiji", "the_world", "zmd_daowangshipian", "zmd_keshi");
		registerSkins(SkinTypes.GRENADE, QualityColor.LEGENDARY,
			"big_banana", "destroy_explosive", "foxy_grenade", "gugugaga", "zmd_cangminmeng");
		registerSkins(SkinTypes.GRENADE, QualityColor.UNBELIEVABLE,
			"lao_gan_ma", "withered_heart_bomb", "beast_ancestors", "haha");

		// Initialize bat skins
		registerSkin(SkinTypes.BAT, "bread", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "red_axe", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.BAT, "steel_tube", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "wolfteeth_mace", QualityColor.EPIC.getColor());

		// New bat skins
		registerSkin(SkinTypes.BAT, "astral_defense", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "advanced_crowbar", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "anvil", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.BAT, "bamboo_bat", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.BAT, "bamboo", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.BAT, "baseball_bat", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.BAT, "battlesign", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.BAT, "between_limits", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "blood_bat", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "composite_club", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "cylinder", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.BAT, "diamond_pickaxe", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "fried_legs", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "hammer", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.BAT, "huaqiangbei", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "ice_bat", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "iron_hammer", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.BAT, "ore_pickaxe", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.BAT, "pipe", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.BAT, "plasma_axe", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.BAT, "road_roller", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.BAT, "sfa", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "slippers", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.BAT, "wrench", QualityColor.UNCOMMON.getColor());

		// New bat skins 2026
		registerSkin(SkinTypes.BAT, "guitar", QualityColor.LEGENDARY.getColor());

		// Supplemental bat skins 2026.4
		registerSkins(SkinTypes.BAT, QualityColor.RARE,
			"tnt_triple_sword", "wolf_teeth_club_2", "zmd_amethyst_fiber");
		registerSkins(SkinTypes.BAT, QualityColor.EPIC,
			"bat_wrench", "black_king", "boming", "combat_instrument", "ground_chain_sickle",
			"purgatory_forging", "rune_sword", "ultimate_gold_weapon", "yellow_sword", "zmd_bambooshoots");
		registerSkins(SkinTypes.BAT, QualityColor.LEGENDARY,
			"snow_kings_staff", "eel", "excalibur");
		registerSkins(SkinTypes.BAT, QualityColor.UNBELIEVABLE,
			"platinum_arm", "chigang", "jin_gu_bang");

		// PVZ bat skins
		registerSkin(SkinTypes.BAT, "pvz_ladder", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "pvz_newspaper", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.BAT, "pvz_tall_peanut", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "pvz_wire_pole", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "pvz_zombie_bat", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.BAT, "pvz_zombie_skin_bat", QualityColor.UNBELIEVABLE.getColor());

		// Hat skins
		registerSkin(SkinTypes.HAT, "baseball_cap", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.HAT, "top_hat", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.HAT, "cowboy_hat", QualityColor.UNCOMMON.getColor());
		registerSkin(SkinTypes.HAT, "crown", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.HAT, "wizard_hat", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.HAT, "santa_hat", QualityColor.RARE.getColor());
		registerSkin(SkinTypes.HAT, "pirate_hat", QualityColor.EPIC.getColor());
		registerSkin(SkinTypes.HAT, "straw_hat", QualityColor.COMMON.getColor());
		registerSkin(SkinTypes.HAT, "cat_ears", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.HAT, "bunny_ears", QualityColor.LEGENDARY.getColor());
		registerSkin(SkinTypes.HAT, "halo", QualityColor.UNBELIEVABLE.getColor());
		registerSkin(SkinTypes.HAT, "devil_horns", QualityColor.EPIC.getColor());
	}
}