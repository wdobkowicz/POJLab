package model;

public interface IPromotion {
	boolean CanCalculate(Koszyk cart);
	void CalculateOffer(Koszyk cart);
}