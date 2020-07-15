-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jun 2020 pada 17.52
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mobil`
--

CREATE TABLE `tb_mobil` (
  `id_mobil` varchar(4) NOT NULL,
  `nama_mobil` varchar(25) NOT NULL,
  `merk_mobil` varchar(15) NOT NULL,
  `no_plat` varchar(12) NOT NULL,
  `harga_rental` int(10) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_mobil`
--

INSERT INTO `tb_mobil` (`id_mobil`, `nama_mobil`, `merk_mobil`, `no_plat`, `harga_rental`, `status`) VALUES
('MB01', 'Alphard', 'Toyota', 'AD 5626 RB', 1000000, 'Ready'),
('MB02', 'Cammry', 'Toyota', 'AD 5627 RB', 850000, 'Ready'),
('MB03', 'New Innova', 'Toyota', 'AD 5628 RB', 750000, 'Ready'),
('MB04', 'City Car', 'Honda', 'AD 5629 RB', 700000, 'Ready'),
('MB05', 'New Avanza Veloz', 'Toyota', 'AD 5630 RB', 650000, 'Ready'),
('MB06', 'Terios', 'Daihatsu', 'AD 5631 RB', 600000, 'Ready'),
('MB07', 'Avanza', 'Toyota', 'AD 5632 RB', 500000, 'Ready'),
('MB08', 'Apv Luxury', 'Suzuki', 'AD 5633 RB', 450000, 'Ready'),
('MB09', 'Grand Livina', 'Nissan', 'AD 5634 RB', 400000, 'Ready'),
('MB10', 'Brio', 'Honda', 'AD 5635 RB', 350000, 'Ready');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pengembalian`
--

CREATE TABLE `tb_pengembalian` (
  `id_pengembalian` varchar(4) NOT NULL,
  `id_transaksi` varchar(4) NOT NULL,
  `id_penyewa` varchar(5) NOT NULL,
  `id_mobil` varchar(4) NOT NULL,
  `tgl_rental` date NOT NULL,
  `tgl_kembali` date NOT NULL,
  `lama` int(5) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_penyewa`
--

CREATE TABLE `tb_penyewa` (
  `id_penyewa` varchar(5) NOT NULL,
  `nama_penyewa` varchar(25) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `no_ktp` varchar(17) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_penyewa`
--

INSERT INTO `tb_penyewa` (`id_penyewa`, `nama_penyewa`, `alamat`, `no_hp`, `no_ktp`) VALUES
('ID01', 'Rahmat Nur Hidayat', 'Karangpandan', '085745649123', '180101167'),
('ID02', 'Revo Alderi A', 'Kerjo', '085755123456', '180101168'),
('ID03', 'Muh Daffa', 'Perum Dalon', '085835123321', '180101169'),
('ID04', 'Andi Lesti', 'Jumantono', '085300900700', '180101170'),
('ID05', 'Mahrub Setiawan', 'Sukoharjo Makmur', '085700123654', '180101171'),
('ID06', 'Hadi Mutaqin', 'Bejen', '085800100876', '180101172'),
('ID07', 'Noki Saputra', 'Giriwono', '085721099123', '180101173'),
('ID08', 'Panji Asmorobangun', 'Gondangrejo', '085678890900', '180101174');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_rental`
--

CREATE TABLE `tb_rental` (
  `id_transaksi` varchar(4) NOT NULL,
  `id_penyewa` varchar(5) NOT NULL,
  `id_mobil` varchar(4) NOT NULL,
  `nama_penyewa` varchar(25) NOT NULL,
  `nama_mobil` varchar(25) NOT NULL,
  `harga_rental` int(10) NOT NULL,
  `tgl_rental` date NOT NULL,
  `status` varchar(15) NOT NULL,
  `no_plat` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_mobil`
--
ALTER TABLE `tb_mobil`
  ADD PRIMARY KEY (`id_mobil`);

--
-- Indeks untuk tabel `tb_pengembalian`
--
ALTER TABLE `tb_pengembalian`
  ADD PRIMARY KEY (`id_pengembalian`);

--
-- Indeks untuk tabel `tb_penyewa`
--
ALTER TABLE `tb_penyewa`
  ADD PRIMARY KEY (`id_penyewa`);

--
-- Indeks untuk tabel `tb_rental`
--
ALTER TABLE `tb_rental`
  ADD PRIMARY KEY (`id_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
