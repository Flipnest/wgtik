function kenaRazia(date, data) {
  let tilang = [];

  for (let i = 0; i < data.length; i++) {
    let kendaraan = data[i];

    // Mengecek apakah kendaraan adalah mobil
    if (kendaraan.type === 'Mobil') {
      let plat = kendaraan.plat;
      let nomorPlat = parseInt(plat.split(' ')[1]);

      // Mengecek apakah nomor plat termasuk ganjil atau genap
      if (nomorPlat % 2 === date % 2) {
        let rute = kendaraan.rute;

        // Mengecek apakah kendaraan melintas di lokasi ganjil genap
        if (
          rute.includes('Gajah Mada') ||
          rute.includes('Hayam Wuruk') ||
          rute.includes('Sisingamangaraja') ||
          rute.includes('Panglima Polim') ||
          rute.includes('Fatmawati') ||
          rute.includes('Tomang Raya')
        ) {
          tilang.push({ name: kendaraan.name, tilang: rute.length });
        }
      }
    }
  }

  return tilang;
}

console.log(
  kenaRazia(27, [
    {
      name: 'Denver',
      plat: 'B 2791 KDS',
      type: 'Mobil',
      rute: ['TB Simatupang', 'Panglima Polim', 'Depok', 'Senen Raya'],
    },
    {
      name: 'Toni',
      plat: 'B 1212 JBB',
      type: 'Mobil',
      rute: [
        'Pintu Besar Selatan',
        'Panglima Polim',
        'Depok',
        'Senen Raya',
        'Kemang',
      ],
    },
    {
      name: 'Stark',
      plat: 'B 444 XSX',
      type: 'Motor',
      rute: ['Pondok Indah', 'Depok', 'Senen Raya', 'Kemang'],
    },
    {
      name: 'Anna',
      plat: 'B 678 DD',
      type: 'Mobil',
      rute: [
        'Fatmawati',
        'Panglima Polim',
        'Depok',
        'Senen Raya',
        'Kemang',
        'Gajah Mada',
      ],
    },
  ])
);
