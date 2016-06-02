# language: pl
Funkcja: Przelew
	Aby lepiej zarządzac własnymi środkami finansowymi
	Chcę, jako klient banku
	Mieć możliwośc przelewania środków pomiędzy moimi rachunkami zawsze gdy tego potrzebuję

Scenariusz: Przelew środków na rachunek oszczędnościowy
	Zakładając, że mam rachunek "bieżący" z saldem 1000.00 PLN
	I mam rachunek "oszczędnościowy" z saldem 2000.00 PLN
	Gdy przeleję 500.00 PLN z rachunku "bieżący" na rachunek "oszczędnościowy"
	Wtedy powinienem miec saldo 500.00 PLN na moim rachunku "bieżący"
	I powinienem miec saldo 2500.00 PLN na moim rachunku "oszczędnościowy"

	