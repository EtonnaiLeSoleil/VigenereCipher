# VigenereCipher

Le chiffre de Vigenère est une méthode de chiffrement polyalphabétique utilisant un mot-clé pour encoder un message. Inventé par le cryptologue français Blaise de Vigenère au XVIe siècle, il repose sur l'utilisation d'une grille/tableau appelée carré de Vigenère qui permet de réaliser des décalages des lettres selon le mot-clé.

## Structure du projet

```
/
├── src/
│   ├── Main.java            ← Point d'entrée du programme
│   ├── VigenereCipher.java  ← Logique de chiffrement/déchiffrement
│   └── OutputWriter.java    ← Écriture du résultat dans un fichier
├── data/
│   └── input.txt            ← Texte à chiffrer
├── out/                     ← Résultats générés (ignoré par git)
├── .gitignore
└── README.md
```

## Comment ça marche ?

### Chiffrement
Chaque lettre du message est décalée dans l'alphabet selon la lettre correspondante de la clé :
```
Message :  H  E  L  L  O
Clé :      B  B  B  B  B
Décalage : +1 +1 +1 +1 +1
Résultat : I  F  M  M  P
```
La clé se répète cycliquement si elle est plus courte que le message.

### Déchiffrement
L'opération inverse est appliquée : chaque lettre du message chiffré est décalée en sens opposé selon la clé.

## Utilisation

### Compiler
```sh
javac -d out src/*.java
```

### Exécuter
```sh
java -cp out Main
```

### Configurer
- Modifiez le texte à chiffrer dans `data/input.txt`
- Modifiez la clé dans `src/Main.java` (variable `cle`)

### Résultat
Le fichier `out/output.txt` contiendra :
- Le texte original
- Le texte chiffré
- Le texte déchiffré
