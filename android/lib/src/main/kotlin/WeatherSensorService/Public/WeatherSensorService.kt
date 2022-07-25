//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

import com.facebook.react.bridge.*

public object WeatherSensorService {
    public val reader: WeatherSensorReaderType = MockWeatherSensorReader()
}