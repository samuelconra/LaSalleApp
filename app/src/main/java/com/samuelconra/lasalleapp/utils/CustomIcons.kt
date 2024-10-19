package com.samuelconra.lasalleapp.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null

public val Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Task!!
    }

private var _Task: ImageVector? = null

public val Cash: ImageVector
    get() {
        if (_Cash != null) {
            return _Cash!!
        }
        _Cash = ImageVector.Builder(
            name = "Cash",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(0f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
        }.build()
        return _Cash!!
    }

private var _Cash: ImageVector? = null







// ICONOS PARA MATERIAS

public val Lab_research: ImageVector
    get() {
        if (_Lab_research != null) {
            return _Lab_research!!
        }
        _Lab_research = ImageVector.Builder(
            name = "Lab_research",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(320f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(87f)
                quadToRelative(-5f, 20f, -6.5f, 40f)
                reflectiveQuadToRelative(0.5f, 40f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(121f)
                quadToRelative(-24f, 15f, -44f, 35f)
                reflectiveQuadToRelative(-35f, 44f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(30f, 0f, 54.5f, -13f)
                reflectiveQuadToRelative(41.5f, -36f)
                quadToRelative(8f, 20f, 18f, 38f)
                reflectiveQuadToRelative(24f, 35f)
                quadToRelative(-27f, 26f, -62f, 41f)
                reflectiveQuadToRelative(-76f, 15f)
                moveTo(120f, 240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(540f, 520f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                reflectiveQuadToRelative(-71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                moveTo(864f, 920f)
                lineTo(756f, 812f)
                quadToRelative(-22f, 14f, -46f, 21f)
                reflectiveQuadToRelative(-50f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                reflectiveQuadToRelative(52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                reflectiveQuadToRelative(127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 26f, -7f, 50f)
                reflectiveQuadToRelative(-21f, 46f)
                lineTo(920f, 864f)
                close()
                moveTo(120f, 240f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        return _Lab_research!!
    }

private var _Lab_research: ImageVector? = null


public val Images: ImageVector
    get() {
        if (_Images != null) {
            return _Images!!
        }
        _Images = ImageVector.Builder(
            name = "Images",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.502f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14.002f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.998f, 2f)
                moveTo(14f, 2f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                horizontalLineToRelative(9.002f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveTo(2.002f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                lineToRelative(2.646f, -2.354f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, -0.062f)
                lineToRelative(2.66f, 1.773f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.577f, -0.094f)
                lineToRelative(1.777f, 1.947f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
        }.build()
        return _Images!!
    }

private var _Images: ImageVector? = null


public val Ethernet: ImageVector
    get() {
        if (_Ethernet != null) {
            return _Ethernet!!
        }
        _Ethernet = ImageVector.Builder(
            name = "Ethernet",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14f, 13.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineTo(12f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 3f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineTo(4f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineTo(6f)
                horizontalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                moveTo(3.75f, 11f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                moveToRelative(2f, 0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                moveToRelative(1.75f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                close()
                moveTo(9.75f, 11f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                moveToRelative(1.75f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                close()
                moveTo(1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
            }
        }.build()
        return _Ethernet!!
    }

private var _Ethernet: ImageVector? = null


public val Book_4: ImageVector
    get() {
        if (_Book_4 != null) {
            return _Book_4!!
        }
        _Book_4 = ImageVector.Builder(
            name = "Book_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(240f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 760f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(120f, -240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-480f)
                horizontalLineTo(360f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 200f)
                verticalLineToRelative(447f)
                quadToRelative(10f, -3f, 19.5f, -5f)
                reflectiveQuadToRelative(20.5f, -2f)
                close()
                moveToRelative(-80f, -480f)
                verticalLineToRelative(487f)
                close()
            }
        }.build()
        return _Book_4!!
    }

private var _Book_4: ImageVector? = null


public val Android2: ImageVector
    get() {
        if (_Android2 != null) {
            return _Android2!!
        }
        _Android2 = ImageVector.Builder(
            name = "Android2",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.213f, 1.471f)
                lineToRelative(0.691f, -1.26f)
                quadToRelative(0.069f, -0.124f, -0.048f, -0.192f)
                quadToRelative(-0.128f, -0.057f, -0.195f, 0.058f)
                lineToRelative(-0.7f, 1.27f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.005f, 0.941f)
                quadToRelative(-1.032f, 0f, -1.956f, 0.404f)
                lineToRelative(-0.7f, -1.27f)
                quadTo(5.281f, -0.037f, 5.154f, 0.02f)
                quadToRelative(-0.117f, 0.069f, -0.049f, 0.193f)
                lineToRelative(0.691f, 1.259f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.673f, 1.476f)
                arcTo(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 5.02f)
                horizontalLineToRelative(9f)
                quadToRelative(0f, -1.125f, -0.623f, -2.072f)
                arcToRelative(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.664f, -1.476f)
                close()
                moveTo(6.22f, 3.303f)
                arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.267f, 0.11f)
                arcToRelative(0.35f, 0.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.263f, -0.11f)
                arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.107f, -0.264f)
                arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.107f, -0.265f)
                arcToRelative(0.35f, 0.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.263f, -0.11f)
                quadToRelative(0.155f, 0f, 0.267f, 0.11f)
                arcToRelative(0.36f, 0.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.112f, 0.265f)
                arcToRelative(0.36f, 0.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.112f, 0.264f)
                moveToRelative(4.101f, 0f)
                arcToRelative(0.35f, 0.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.262f, 0.11f)
                arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.268f, -0.11f)
                arcToRelative(0.36f, 0.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.112f, -0.264f)
                quadToRelative(0f, -0.154f, 0.112f, -0.265f)
                arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.268f, -0.11f)
                quadToRelative(0.155f, 0f, 0.262f, 0.11f)
                arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.107f, 0.265f)
                quadToRelative(0f, 0.153f, -0.107f, 0.264f)
                moveTo(3.5f, 11.77f)
                quadToRelative(0f, 0.441f, 0.311f, 0.75f)
                quadToRelative(0.311f, 0.306f, 0.76f, 0.307f)
                horizontalLineToRelative(0.758f)
                lineToRelative(0.01f, 2.182f)
                quadToRelative(0f, 0.414f, 0.292f, 0.703f)
                arcToRelative(0.96f, 0.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, 0.288f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -0.288f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.292f, -0.703f)
                verticalLineToRelative(-2.182f)
                horizontalLineToRelative(1.343f)
                verticalLineToRelative(2.182f)
                quadToRelative(0f, 0.414f, 0.292f, 0.703f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0.288f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -0.288f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.292f, -0.703f)
                verticalLineToRelative(-2.182f)
                horizontalLineToRelative(0.76f)
                quadToRelative(0.436f, 0f, 0.749f, -0.308f)
                quadToRelative(0.31f, -0.307f, 0.311f, -0.75f)
                verticalLineTo(5.365f)
                horizontalLineToRelative(-9f)
                close()
                moveToRelative(10.495f, -6.587f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.702f, 0.278f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.293f, 0.685f)
                verticalLineToRelative(4.063f)
                quadToRelative(0f, 0.406f, 0.293f, 0.69f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.702f, 0.284f)
                quadToRelative(0.42f, 0f, 0.712f, -0.284f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.293f, -0.69f)
                verticalLineTo(6.146f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.293f, -0.685f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.712f, -0.278f)
                moveToRelative(-12.702f, 0.283f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.712f, -0.283f)
                quadToRelative(0.41f, 0f, 0.702f, 0.283f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.293f, 0.68f)
                verticalLineToRelative(4.063f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.288f, 0.69f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.707f, 0.284f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.712f, -0.284f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.293f, -0.69f)
                verticalLineTo(6.146f)
                quadToRelative(0f, -0.396f, 0.293f, -0.68f)
            }
        }.build()
        return _Android2!!
    }

private var _Android2: ImageVector? = null


public val Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(320f, 720f)
                lineTo(80f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(57f, 57f)
                lineToRelative(-184f, 184f)
                lineToRelative(183f, 183f)
                close()
                moveToRelative(320f, 0f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -184f)
                lineToRelative(-183f, -183f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                close()
            }
        }.build()
        return _Code!!
    }

private var _Code: ImageVector? = null


public val Database: ImageVector
    get() {
        if (_Database != null) {
            return _Database!!
        }
        _Database = ImageVector.Builder(
            name = "Database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 840f)
                quadToRelative(-151f, 0f, -255.5f, -46.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -66f, 105.5f, -113f)
                reflectiveQuadTo(480f, 120f)
                reflectiveQuadToRelative(254.5f, 47f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 67f, -104.5f, 113.5f)
                reflectiveQuadTo(480f, 840f)
                moveToRelative(0f, -479f)
                quadToRelative(89f, 0f, 179f, -25.5f)
                reflectiveQuadTo(760f, 281f)
                quadToRelative(-11f, -29f, -100.5f, -55f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-91f, 0f, -178.5f, 25.5f)
                reflectiveQuadTo(200f, 281f)
                quadToRelative(14f, 30f, 101.5f, 55f)
                reflectiveQuadTo(480f, 361f)
                moveToRelative(0f, 199f)
                quadToRelative(42f, 0f, 81f, -4f)
                reflectiveQuadToRelative(74.5f, -11.5f)
                reflectiveQuadToRelative(67f, -18.5f)
                reflectiveQuadToRelative(57.5f, -25f)
                verticalLineToRelative(-120f)
                quadToRelative(-26f, 14f, -57.5f, 25f)
                reflectiveQuadToRelative(-67f, 18.5f)
                reflectiveQuadTo(561f, 436f)
                reflectiveQuadToRelative(-81f, 4f)
                reflectiveQuadToRelative(-82f, -4f)
                reflectiveQuadToRelative(-75.5f, -11.5f)
                reflectiveQuadTo(256f, 406f)
                reflectiveQuadToRelative(-56f, -25f)
                verticalLineToRelative(120f)
                quadToRelative(25f, 14f, 56f, 25f)
                reflectiveQuadToRelative(66.5f, 18.5f)
                reflectiveQuadTo(398f, 556f)
                reflectiveQuadToRelative(82f, 4f)
                moveToRelative(0f, 200f)
                quadToRelative(46f, 0f, 93.5f, -7f)
                reflectiveQuadToRelative(87.5f, -18.5f)
                reflectiveQuadToRelative(67f, -26f)
                reflectiveQuadToRelative(32f, -29.5f)
                verticalLineToRelative(-98f)
                quadToRelative(-26f, 14f, -57.5f, 25f)
                reflectiveQuadToRelative(-67f, 18.5f)
                reflectiveQuadTo(561f, 636f)
                reflectiveQuadToRelative(-81f, 4f)
                reflectiveQuadToRelative(-82f, -4f)
                reflectiveQuadToRelative(-75.5f, -11.5f)
                reflectiveQuadTo(256f, 606f)
                reflectiveQuadToRelative(-56f, -25f)
                verticalLineToRelative(99f)
                quadToRelative(5f, 15f, 31.5f, 29f)
                reflectiveQuadToRelative(66.5f, 25.5f)
                reflectiveQuadToRelative(88f, 18.5f)
                reflectiveQuadToRelative(94f, 7f)
            }
        }.build()
        return _Database!!
    }

private var _Database: ImageVector? = null


public val Eye_tracking: ImageVector
    get() {
        if (_Eye_tracking != null) {
            return _Eye_tracking!!
        }
        _Eye_tracking = ImageVector.Builder(
            name = "Eye_tracking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(240f, 920f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 920f)
                close()
                moveTo(480f, 740f)
                quadToRelative(-120f, 0f, -217.5f, -71f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(45f, -118f, 142.5f, -189f)
                reflectiveQuadTo(480f, 220f)
                reflectiveQuadToRelative(217.5f, 71f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(-45f, 118f, -142.5f, 189f)
                reflectiveQuadTo(480f, 740f)
                moveToRelative(0f, -80f)
                quadToRelative(88f, 0f, 161f, -48f)
                reflectiveQuadToRelative(112f, -132f)
                quadToRelative(-39f, -84f, -112f, -132f)
                reflectiveQuadToRelative(-161f, -48f)
                reflectiveQuadToRelative(-161f, 48f)
                reflectiveQuadToRelative(-112f, 132f)
                quadToRelative(39f, 84f, 112f, 132f)
                reflectiveQuadToRelative(161f, 48f)
                moveToRelative(0f, -40f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                reflectiveQuadToRelative(-41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                reflectiveQuadToRelative(-99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                reflectiveQuadToRelative(41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                moveToRelative(0f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 480f)
                reflectiveQuadToRelative(17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                reflectiveQuadToRelative(42.5f, 17.5f)
                reflectiveQuadTo(540f, 480f)
                reflectiveQuadToRelative(-17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                moveTo(40f, 240f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(800f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(120f)
                close()
                moveTo(480f, 480f)
            }
        }.build()
        return _Eye_tracking!!
    }

private var _Eye_tracking: ImageVector? = null


public val Close: ImageVector
    get() {
        if (_Close != null) {
            return _Close!!
        }
        _Close = ImageVector.Builder(
            name = "Close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(256f, 760f)
                lineToRelative(-56f, -56f)
                lineToRelative(224f, -224f)
                lineToRelative(-224f, -224f)
                lineToRelative(56f, -56f)
                lineToRelative(224f, 224f)
                lineToRelative(224f, -224f)
                lineToRelative(56f, 56f)
                lineToRelative(-224f, 224f)
                lineToRelative(224f, 224f)
                lineToRelative(-56f, 56f)
                lineToRelative(-224f, -224f)
                close()
            }
        }.build()
        return _Close!!
    }

private var _Close: ImageVector? = null


public val Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(382f, 720f)
                lineTo(154f, 492f)
                lineToRelative(57f, -57f)
                lineToRelative(171f, 171f)
                lineToRelative(367f, -367f)
                lineToRelative(57f, 57f)
                close()
            }
        }.build()
        return _Check!!
    }

private var _Check: ImageVector? = null


public val ExclamationCircle: ImageVector
    get() {
        if (_ExclamationCircle != null) {
            return _ExclamationCircle!!
        }
        _ExclamationCircle = ImageVector.Builder(
            name = "ExclamationCircle",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.002f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                moveTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.8f, 0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, 0f)
                close()
            }
        }.build()
        return _ExclamationCircle!!
    }

private var _ExclamationCircle: ImageVector? = null
