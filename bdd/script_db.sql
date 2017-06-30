DROP TABLE IF EXISTS Ticket;
DROP TABLE IF EXISTS Produit;

CREATE TABLE Produit (
	IDProduit INTEGER PRIMARY KEY AUTOINCREMENT,
	nomProduit TEXT
);

CREATE TABLE Ticket (
	IDTicket INTEGER PRIMARY KEY,
	numeroTicket INTEGER,
	libelleTicket TEXT,
	prixTicket REAL check(prixTicket > 0.00),
	dateTicket DATE check(dateTicket = date('now')),
	IDProduit INTEGER REFERENCES Produit(IDProduit)
);