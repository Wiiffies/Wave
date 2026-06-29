cmake_minimum_required(VERSION 3.22)
project(WaveESP)
add_executable(WaveESP main.cpp)
target_link_libraries(WaveESP d3d11 dxgi)
# Add ImGui sources as subdir
