-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 31 déc. 2020 à 18:25
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `tangerlab`
--

-- --------------------------------------------------------

--
-- Structure de la table `manutentionneur`
--

CREATE TABLE `manutentionneur` (
  `id` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Debut_date` varchar(50) NOT NULL,
  `Hours_number` int(11) NOT NULL,
  `Salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `manutentionneur`
--

INSERT INTO `manutentionneur` (`id`, `Nom`, `Prenom`, `Age`, `Debut_date`, `Hours_number`, `Salaire`) VALUES
(1, 'MORAD', 'MORAD', 20, '22/03/2012', 5, 250),
(5, 'YASSIN', 'YASSIN', 21, '21/10/2020', 10, 0),
(2, 'SAMI', 'SAMI', 23, '12/02/12', 10, 0),
(9, 'ZAK', 'ZAK', 10, '10/10/10', 10, 0);

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

CREATE TABLE `producteur` (
  `id` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Debut_date` varchar(50) NOT NULL,
  `Unite_Number` int(11) NOT NULL,
  `Salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `representeur`
--

CREATE TABLE `representeur` (
  `id` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Debut_date` varchar(50) NOT NULL,
  `chiffreAffaire` double NOT NULL,
  `Salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `risque_manutentionneur`
--

CREATE TABLE `risque_manutentionneur` (
  `id` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Debut_date` varchar(50) NOT NULL,
  `Hours_number` int(11) NOT NULL,
  `Salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `risque_producteur`
--

CREATE TABLE `risque_producteur` (
  `id` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Debut_date` varchar(50) NOT NULL,
  `Unite_Number` int(11) NOT NULL,
  `Salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `vendeur`
--

CREATE TABLE `vendeur` (
  `id` int(11) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Debut_date` varchar(50) NOT NULL,
  `chiffreAffaire` double NOT NULL,
  `Salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `vendeur`
--

INSERT INTO `vendeur` (`id`, `Nom`, `Prenom`, `Age`, `Debut_date`, `chiffreAffaire`, `Salaire`) VALUES
(2, 'ABOULFATH', 'ZAKARIAE', 24, '26/12/2020', 1000, 1500);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
