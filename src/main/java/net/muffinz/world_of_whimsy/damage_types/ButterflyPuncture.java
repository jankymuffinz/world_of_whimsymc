package net.muffinz.world_of_whimsy.damage_types;

import com.mojang.datafixers.util.Either;
import net.minecraft.entity.damage.DamageScalingType;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Holder;
import net.minecraft.registry.HolderOwner;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ButterflyPuncture implements Holder<DamageType> {


	@Override
	public DamageType value() {
		return new DamageType("", DamageScalingType.ALWAYS, 1.0f);
	}

	@Override
	public boolean isBound() {
		return false;
	}

	@Override
	public boolean isRegistryKeyId(Identifier id) {
		return false;
	}

	@Override
	public boolean isRegistryKey(RegistryKey<DamageType> registryKey) {
		return false;
	}

	@Override
	public boolean matches(Predicate<RegistryKey<DamageType>> predicate) {
		return false;
	}

	@Override
	public boolean isIn(TagKey<DamageType> tag) {
		return false;
	}

	@Override
	public Stream<TagKey<DamageType>> streamTags() {
		return null;
	}

	@Override
	public Either<RegistryKey<DamageType>, DamageType> unwrap() {
		return null;
	}

	@Override
	public Optional<RegistryKey<DamageType>> getKey() {
		return Optional.empty();
	}

	@Override
	public Kind getKind() {
		return null;
	}

	@Override
	public boolean isOwnedBy(HolderOwner<DamageType> owner) {
		return false;
	}
}
