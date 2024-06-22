-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Jun 2024 pada 17.51
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tictactoe`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `game_scores`
--

CREATE TABLE `game_scores` (
  `id` int(11) NOT NULL,
  `Nama_X` varchar(50) NOT NULL,
  `Nama_O` varchar(50) NOT NULL,
  `player_x` int(11) DEFAULT NULL,
  `player_o` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `game_scores`
--

INSERT INTO `game_scores` (`id`, `Nama_X`, `Nama_O`, `player_x`, `player_o`) VALUES
(1, 'sultan', 'lutpi', 1, 0),
(2, 'sultan', 'lutpi', 0, 0),
(3, 'sultan', 'lutpi', 1, 0),
(4, 'sultan', 'lutpi', 1, 1),
(5, 'as', 'ds', 1, 0),
(6, 'as', 'ds', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `game_scores`
--
ALTER TABLE `game_scores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `game_scores`
--
ALTER TABLE `game_scores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
