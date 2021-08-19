package com.example.anroid_toy_project.android_ui

// 안드로이드에서 화면을 그리는 방법
// - XML을 이용한다.
// - XML은 뭘까? -> DSL Language(Domain Specific Language)
// -안드로이드 UI를 그리기 위해 특하된 언어이다.

// 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야할까?
// - 픽셀, dpi, dp 단위
// - 픽셀: 핸드폰 화면에서 빛이 나오는 전구로 가장 작은 단위
// - dpi: dot per inch (1 inch 안에 pixel이 얼마나 많은가?)
//      - lpdi: 120
//      - mdpi: 160
//      - hdpi: 240
//      - xhdpi: 320
//      - xxhdpi: 480
//      - xxhdpi: 640
//  - dp: Density Independent Pixel
//      - 픽셀에 독립적인 단